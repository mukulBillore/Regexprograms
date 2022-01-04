package com.bridgeLab.regex;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String re1 = "[A-Z][a-z]{3}[a-z]*";
		RegexPract uc1 = new RegexPract(re1);
		System.out.println("Enter the first name to check");	
		String input1=sc.nextLine();
		System.out.println(uc1.patternChecker(input1));
	}

}
