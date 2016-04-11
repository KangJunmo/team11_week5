package com.team11.week5;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainProgram {
	private static Logger log;
	private static Scanner scan;
	int argsLength = 0;
	
	MainProgram(String[] args) {
		argsLength = args.length;
	}
	
	public static void main(String[] args){
		scan = new Scanner(System.in);
		MainProgram mp = new MainProgram(args);
		
		if(mp.argsLength == 3) {
			scan = new Scanner(args[0] + " " + args[1] + " " + args[2]);
		} else if(mp.argsLength > 3) {
			scan.close();
			scan = new Scanner(args[0] + " " + args[1] + " " + args[2]);
		}
		
		log = Logger.getLogger("Logger");
		
		InfoGetter userInfo = new InfoGetter(scan);
		
		Calculator calc = new Calculator(userInfo);
		
		log.log(Level.INFO, calc.sumTotalRate());
		
	}
	

}
