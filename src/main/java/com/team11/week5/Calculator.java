package com.team11.week5;

import java.text.NumberFormat;

public class Calculator {
	protected PlanRates planRates;
	private String plan;
	private int minutesUsed;
	private int numberOfLines;
	
	protected double basicMonthlyRate; 
	private double additionalLineRate;
	private int includedMinutes;
	private double ratePerExcessMinute;
	
	private NumberFormat nf;
	
	protected String totalRate; 
	
	public Calculator(InfoGetter userInfo){
		
		plan = userInfo.getPlan();
		minutesUsed = userInfo.getMinutesUsed();
		numberOfLines = userInfo.getNumberOfLines();

		setPlan(plan);
		
		basicMonthlyRate = planRates.getBasicMonthlyRate(); 
		additionalLineRate = planRates.getAdditionalLineRate(); 
		includedMinutes = planRates.getIncludedMinutes(); 
		ratePerExcessMinute = planRates.getRatePerExcessMinute(); 

		nf = NumberFormat.getInstance();
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(2);
	}
	
	protected boolean setPlan(String plan){
		if("Gold".equals(plan)){
			planRates = new Gold();
			return true;
		}
		else if ("Silver".equals(plan)){
			planRates = new Silver();
			return true;
		}
		return false;
	}
	
	protected double calcExcessRateByMinute(){
		if(minutesUsed - includedMinutes <= 0){ 
			return 0;
		} 
		else { 
			return (minutesUsed-includedMinutes) * ratePerExcessMinute;
		}
	}
	
	protected double calcExcessRateByLines(){
		if (numberOfLines == 1) 
			return 0;
		else if (numberOfLines<4){
			return (numberOfLines-1)*additionalLineRate;
		} 
		else{
			return (2*additionalLineRate) + (5*(numberOfLines-3));
		}
		
	}
	public String sumTotalRate(){
		totalRate = nf.format(basicMonthlyRate + calcExcessRateByMinute() + calcExcessRateByLines());
		return "\nBasicMontlyRate : " + basicMonthlyRate + 
				"\nExcessRateByMinute : " + nf.format(calcExcessRateByMinute()) + 
				"\nExcessRateByLines : " + calcExcessRateByLines() +
				"\n-> Expected Bill : " + totalRate;
	}
}
