package com.team11.week5;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Logger;

import java.util.logging.Level;

public class InfoGetter {
	private String plan;
	private int minutesUsed;
	private int numberOfLines;	

	public InfoGetter(Scanner sc){
		PrintStream out=System.out;
		
		out.println("Input the plan : (Gold or Silver)");
		this.plan = sc.next();
		
		out.println("Input the minutes used : ");
		this.minutesUsed = sc.nextInt();
		
		out.println("Input the number of lines : ");
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
