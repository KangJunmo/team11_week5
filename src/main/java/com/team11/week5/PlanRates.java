package com.team11.week5;

public abstract class PlanRates {
	public static final double basicMontlyRate = 0;
	public static final double ratePerExcessMinute = 0;
	public static final int includeMinutes = 0;
	public static final double adittionalLineRate = 0;

	public abstract double getBasicMonthlyRate();
	
	public abstract int getIncludedMinutes();
	
	public abstract double getRatePerExcessMinute();
	
	public abstract double getAdditionalLineRate();
}
