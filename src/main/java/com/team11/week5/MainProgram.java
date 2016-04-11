package com.team11.week5;

import java.io.PrintStream;
import java.util.Scanner;

public class MainProgram {
	private static Scanner scan = new Scanner(System.in);
	
	MainProgram(String[] args) {
		scan = new Scanner(args[0] + " " + args[1] + " " + args[2]);
	}
	
	public static void main(String[] args){
	    
		PrintStream out=System.out;
				
		InfoGetter userInfo = new InfoGetter(scan);
		
		Calculator calc = new Calculator(userInfo);
		
		out.println(calc.sumTotalRate());	
	}
	

}
