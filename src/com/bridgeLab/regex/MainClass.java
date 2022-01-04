package com.bridgeLab.regex;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
	//uc1	
		String re1 = "[A-Z][a-z]{3}[a-z]*";
		RegexPract firstName = new RegexPract(re1);
		System.out.println("Enter the first name to check");	
		String input1=sc.nextLine();
		System.out.println(firstName.patternChecker(input1));
	// uc2
		String re2 = "[A-Z][a-z]{3}[a-z]*";
		RegexPract lastName = new RegexPract(re2);
		System.out.println("Enter the last name to check");	
		String input2=sc.nextLine();
		System.out.println(lastName.patternChecker(input2));
	// uc3 
		String re3 = "^[a-zA-Z0-9]*(\\.[a-z0-9]+)?@bl\\.co(\\.in)?$";
		RegexPract email = new RegexPract(re3);
		System.out.println("Enter the mail to check");	
		String input3=sc.nextLine();
		System.out.println(email.patternChecker(input3));
*/ 
		//uc4
		String re4 = "\\+[0-9]{2}[0-9]{10}";
		RegexPract mobileFormat = new RegexPract(re4);
		System.out.println("Enter the mobile number to check");	
		String input4=sc.nextLine();
		System.out.println(mobileFormat.patternChecker(input4));
	
	}

}
