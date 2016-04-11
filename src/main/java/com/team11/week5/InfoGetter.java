package com.team11.week5;
import java.util.Scanner;
import java.util.logging.Logger;

import java.util.logging.Level;

public class InfoGetter {
	private String plan;
	private int minutesUsed;
	private int numberOfLines;	
	private Logger log;

	public InfoGetter(Scanner sc){
		log = Logger.getLogger("Logger");
		
		log.log(Level.INFO, "Input the plan : (Gold or Silver)");
		this.plan = sc.next();
		
		log.log(Level.INFO, "Input the minutes used : ");
		this.minutesUsed = sc.nextInt();
		
		log.log(Level.INFO, "Input the number of lines : ");
		this.numberOfLines = sc.nextInt();
	}
	
	public String getPlan(){
		return plan;
	}
	
	public int getMinutesUsed(){
		return minutesUsed;
	}
	
	public int getNumberOfLines(){
		return numberOfLines;
	}
	
}
