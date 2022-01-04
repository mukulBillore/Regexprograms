package com.bridgeLab.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPract implements PatternValidate{
	final String regularExp;
	public RegexPract(String regularExp) {
		super();
		this.regularExp = regularExp;
	}
	@Override
	public boolean patternChecker(String input) {
		return Pattern.matches(this.regularExp, input);
	}
	

}
