package com.basic;

public class SwichCaseDemo {
public static void main(String[] args) {
	int choice=899;
	
	switch (choice) {
	case 1:
		System.out.println("Fan is on!!!");
		break;
	case 2:
		System.out.println("Light is on!!!");
		break;
	case 3:
		System.out.println("AC is on!!!");
		break;
	case 4:
		System.out.println("Geyser is on!!!");
		break;
	default:
		System.out.println("Invalid input!!!");
		break;
	}
	
	//vowel and consonant
	char ch='i';
	switch (ch) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
		System.out.println("Vowel!!!");
		break;

	default:
		System.out.println("Consonant!!!");
		break;
	}
}
}
