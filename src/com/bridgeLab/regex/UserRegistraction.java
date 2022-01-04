package com.bridgeLab.regex;

import java.util.regex.Pattern;

public class UserRegistraction {
	//Pattern.matches(this.regularExp, input);
private final String firstNameRegex= "[A-Z][a-z]{3}[a-z]*";;
private final String lastNameRegex="[A-Z][a-z]{3}[a-z]*";
private final String emailRegex="^[a-zA-Z0-9]*(\\.[a-z0-9]+)?@bl\\.co(\\.in)?$";
private final String mobileNoRegex="\\+[0-9]{2}[0-9]{10}";
private final String passwordRegex="";
public String getFirstNameRegex() {
	return firstNameRegex;
}
public String getLastNameRegex() {
	return lastNameRegex;
}
public String getEmailRegex() {
	return emailRegex;
}
public String getMobileNoRegex() {
	return mobileNoRegex;
}
public String getPasswordRegex() {
	return passwordRegex;
}


}