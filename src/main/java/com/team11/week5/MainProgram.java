package com.team11.week5;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainProgram {
	private static Logger log;
	private static Scanner scan = new Scanner(System.in);
	
	MainProgram(String[] args) {
		scan = new Scanner(args[0] + " " + args[1] + " " + args[2]);
	}
	
	public static void main(String[] args){
		log = Logger.getLogger("Logger");
		
		InfoGetter userInfo = new InfoGetter(scan);
		
		Calculator calc = new Calculator(userInfo);
		
		log.log(Level.INFO, calc.sumTotalRate());
	}
	

}
