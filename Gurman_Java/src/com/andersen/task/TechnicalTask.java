package com.andersen.task;

import java.util.Scanner;

public class TechnicalTask {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter a number, a name or numeric array (comma separated):");
		String input = scan.nextLine().replaceAll(" ","");
		String str = "John";
		
        if(input.matches("([89]|[1-9][0-9]+)")) {		
        	System.out.println("Hello");	
        }
        else if(input.equals(str)){
        	System.out.println("Hello, John");
        }
        else if(input.matches("[A-Z][a-z]+") && !input.equals(str)){
        	System.out.println("There is no such name");
        }	
        else if(input.matches("^\\s*\\d+(\\s*,\\s*\\d+)*\\s*$")) {
        	String [] stringArray = input.split(",");
        	int [] intArray = new int[stringArray.length];
        	int i = 0;
        	for( String ch: stringArray) {
        		intArray[i] = Integer.parseInt(ch); 
        		i++; 
            } for( int num:intArray )
            	if(num%3==0)
        	System.out.print(num + " ");
     
        } else {
        	System.out.println("Invalid input");
        		}
        	}
	    }
	

