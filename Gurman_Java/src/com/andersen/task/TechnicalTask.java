package com.andersen.task;

import java.util.Arrays;
import java.util.Scanner;

public class TechnicalTask {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String input = scan.nextLine();
		String str = "John";
		
        if(input.matches("([89]|[1-9][0-9]+)")) {		
        	System.out.println("Hello");	
        }
        if(input.equals(str)){
        	System.out.println("Hello, John");
        }
        if(input.matches("[A-Z][a-z]+") && !input.equals(str)){
        	System.out.println("There is no such name");
        }	
        if(input.contains(",")){
        	String [] stringArray = input.split(",");
        	int [] intArray = new int[stringArray.length];
        	int i = 0;
        	for( String ch: stringArray) {
        		intArray[i] = Integer.parseInt(ch); 
        		i++; 
            } for( int num:intArray )
            	if(num%3==0)
        	System.out.println(num);
        
     
        		}
        	}
	    }
	

