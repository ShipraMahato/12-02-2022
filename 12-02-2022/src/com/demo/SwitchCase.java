package com.demo;

public class SwitchCase {

	public static void main(String[] args) {
		char ch='a';    

		if(ch>='a'&& ch<='z')
		{ 
			System.out.println("Data entered is alphabet");
		}
		else 
		{
			System.out.println("Data entered is a number");
		}
		switch(ch)  
		{  
		case '@':   
			System.out.println(" Data entered is special character");  
			break;  
		case '#':   
			System.out.println(" Data enteredis special character");  
			break;
		case '$':   
			System.out.println(" Data entered is special character");  
			break;  
		case '&':   
			System.out.println(" Data entered special character");  
			break; 
		case '!':   
			System.out.println(" Data enteredis special character");  
			break; 

		default:   
			System.out.println(" Data entered is number");  
		}
	}

}
