package com.exercise9bubblesort.app;

import java.util.Random;
public class BubbleSort 
{

	public static void main(String[] args) 
	{
		
		//Constant declaration
		final int ELEMENTS_ARRAY=10;
		
		//Variable declaration
        int temp=0;
        
        //Arrays
        int[] disorderedArray=new int[10];
        int[] orderedArray=new int[10];
        
        Random randomNumbers=new Random(System.nanoTime());
        
        //Create the vector with the random values
       
        for(int i=0;i<ELEMENTS_ARRAY;i++)
        {
        	
        	disorderedArray[i]=randomNumbers.nextInt(11);
        }
        
        //Display the disordered vector
        for(int i=0;i<ELEMENTS_ARRAY;i++)
        {
        	System.out.print(disorderedArray[i]+" ");
        }
        
	    for(int i=0;i<ELEMENTS_ARRAY;i++)
	    {
	    		for(int j=0;j<ELEMENTS_ARRAY-1;j++)
	    		{
	    			if(disorderedArray[j]>disorderedArray[j+1])
	    			{
	    				temp=disorderedArray[j+1];
	    				disorderedArray[j+1]=disorderedArray[j];
	    				disorderedArray[j]=temp;
	    				
	    			}
	    			
	    		}
	    }
	    System.out.println(" ");
	    //Display the disordered vector
	    for(int i=0;i<ELEMENTS_ARRAY;i++)
	
	    {
	    	
	    	System.out.print(disorderedArray[i]+" ");
	    }
	}
		
	

}
