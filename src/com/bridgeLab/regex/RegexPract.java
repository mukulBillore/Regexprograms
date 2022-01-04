package com.bridgeLab.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPract implements PatternValidate{
	 String regularExp;
	public RegexPract(String regularExp) {
		super();
		this.regularExp = regularExp;
	}
	public RegexPract() {
	}
	@Override
	public boolean patternChecker(String input) {
		return Pattern.matches(this.regularExp, input);
	}
	public boolean patternChecker(String input,String regularExp) {
		return Pattern.matches(regularExp, input);
	}
	
	

}
