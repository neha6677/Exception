package com.exception;

import java.util.Arrays;

class Parent{    
	  void msg()throws NullPointerException ,ArrayIndexOutOfBoundsException {  
		    
		  int arr[] = {77, 34, 45, 90, 98};
		  int max = arr[0];  
	        //Loop through the array  
	        for (int i = 0; i < arr.length; i++) {  
	            //Compare elements of array with max  
	           if(arr[i] > max)  
	              max = arr[i];  
	        System.out.println("Largest in given array is " +max);
	        }
	        
		  }    
		}    
		    
		public class ExceptionHandlingByOveriding extends Parent{    
			
		  void msg()throws NumberFormatException , NullPointerException {  
			  int arr[] = {77, 34, 45, 90, 98};
		       
			  int max = arr[0];  
		        //Loop through the array  
		        for (int i = 0; i < arr.length; i++) {  
		            //Compare elements of array with max  
		           if(arr[i] > max)  
		               max = arr[i]; 
		           arr[i] = (Integer) null;
		        }
		        System.out.println("Largest in given array is " +max);
		        

		        double d = Arrays.stream(arr).average().getAsDouble();
		        System.out.println("Average is " +d);
		  }    
		    
		  public static void main(String args[]) {    
		   Parent p = new ExceptionHandlingByOveriding();    
		      
		   //p.msg(); 
		   try {    
		   p.msg();    
		   }  
		   catch (Exception e){
			   
			   System.out.println(e);
		   } 
		  
		  }    
		}    
