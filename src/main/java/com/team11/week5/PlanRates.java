package com.team11.week5;

public abstract class PlanRates {
	public static final double BASICMONTLYRATE = 0;
	public static final int INCLUDEDMINUTES = 0;
	public static final double ADITTIONALLINERATE = 0;
	public static final double RATEPEREXCESSMINUTE = 0;

	public abstract double getBasicMonthlyRate();
	
	public abstract int getIncludedMinutes();
	
	public abstract double getRatePerExcessMinute();
	
	public abstract double getAdditionalLineRate();
}
