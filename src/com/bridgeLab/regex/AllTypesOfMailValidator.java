package com.bridgeLab.regex;

import java.util.regex.Pattern;

public class AllTypesOfMailValidator {

	public static void main(String[] args) {
	String mailRegex= "^[a-zA-Z0-9\\-\\+]*(\\.[a-z0-9]+)?@[a-zA-z0-9]*(\\.com)*?(\\.in)?(\\.net)?(\\.au)?$";
	String input1="abc@yahoo.com";
	String input2="abc-100@yahoo.com";
	String input3="abc111@abc.com";
	String input4="abc-100@abc.net";
	String input5="abc.100@abc.com.au";
	String input6="abc@1.com";
	String input7="abc@gmail.com.com";
	String input8="abc+100@gmail.com";
	
	System.out.println(Pattern.matches(mailRegex, input1));
	System.out.println(Pattern.matches(mailRegex, input2));
	System.out.println(Pattern.matches(mailRegex, input3));
	System.out.println(Pattern.matches(mailRegex, input4));
	System.out.println(Pattern.matches(mailRegex, input5));
	System.out.println(Pattern.matches(mailRegex, input6));
	System.out.println(Pattern.matches(mailRegex, input7));
	System.out.println(Pattern.matches(mailRegex, input8));
	}

}
