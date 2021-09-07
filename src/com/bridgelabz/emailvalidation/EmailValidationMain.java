package com.bridgelabz.emailvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationMain {

	public static boolean checkForValidEmailAddress(String emailAddress) {
		boolean isValidEmailAddress;
		String emailRegex = "^[a-zA-Z]{1,}[@]{1}[a-zA-Z]{1,}";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(emailAddress);

		isValidEmailAddress = matcher.matches();
		return isValidEmailAddress;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Email Validator !");
		String inputEmailAddress = "abc@ama";

		if (checkForValidEmailAddress(inputEmailAddress)) {
			System.out.println(inputEmailAddress + " is valid.");
		} else
			System.out.println(inputEmailAddress + " is invalid");

	}

}
