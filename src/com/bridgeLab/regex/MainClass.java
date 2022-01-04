package com.bridgeLab.regex;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String re1 = "[A-Z][a-z]{3}[a-z]*";
		RegexPract firstName = new RegexPract(re1);
		System.out.println("Enter the first name to check");	
		String input1=sc.nextLine();
		System.out.println(firstName.patternChecker(input1));
		String re2 = "[A-Z][a-z]{3}[a-z]*";
		RegexPract lastName = new RegexPract(re1);
		System.out.println("Enter the last name to check");	
		String input2=sc.nextLine();
		System.out.println(lastName.patternChecker(input2));
	}

}
