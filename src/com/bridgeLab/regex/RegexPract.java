package com.bridgeLab.regex;
import java.util.regex.Pattern;

public class RegexPract implements PatternValidate{
	final String regularExp;
	public RegexPract(String regularExp) {
		super();
		this.regularExp = regularExp;
	}
	public RegexPract() {
		this.regularExp = "please enter a valid regular exp as constructor";
	}
	@Override
	public boolean patternChecker(String input) {
		return Pattern.matches(this.regularExp, input);
	}
	public boolean patternChecker(String input,String regularExp) {
		return Pattern.matches(regularExp, input);
	}
	
	

}
