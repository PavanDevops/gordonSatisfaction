package com.dbs.assignment;

import com.dbs.calculate.MaxSatisfaction;
import com.dbs.inputData.InputData;

public class Satisfaction {

	public static void main(String[] args) {
		InputData i = new InputData ();
		//First element contains total available time and number of items
	       String first_element = i.data.get(0); 
	       
	       //Split out values into two different variables
	       int total_time = Integer.parseInt(first_element.split(" ")[0]);
	       int number_of_items = Integer.parseInt(first_element.split(" ")[1]);
	       
	       System.out.println("Total time = " + total_time);
	       System.out.println("Number of items = " + number_of_items);
	       
	       i.data.remove(0); //Remove first element as it's not needed in the ArrayList anymore
	       
	       //declare empty arrays each for values of satisfaction and time
	       int[] satisfaction = new int[number_of_items]; 
	       int[] time = new int[number_of_items];
	       
	       //Parse through data arraylist and filter out satisfaction and time into respective arrays
	       for (int j = 0; j < number_of_items; j++) 
	       {
	           satisfaction[j] = Integer.parseInt(i.data.get(j).split(" ")[0]);
	           time[j] = Integer.parseInt(i.data.get(j).split(" ")[1]);
	       }
	       
	       //Call solve method and pass in the parameters
	       System.out.println("Maximum achievable satisfaction = " + MaxSatisfaction.solve(total_time,time,satisfaction,number_of_items));
	       
        } 


	}