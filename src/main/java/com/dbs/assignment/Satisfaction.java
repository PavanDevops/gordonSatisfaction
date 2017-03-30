/* This is the main class which starts by compiler first
 * Getting the input from inputData class and loading them to object i
 * Splitting the data as columns and loading them string object
 * Parsing the splitted data to seperate variables as satisfaction (s) and time (t)
 * Total time and No of Items taken from first line of the inputData file.
 * Sending the values "Total time, No of Items, time and satisfaction to calculate method
 * to find the Max Satisfaction
 */
package com.dbs.assignment;

import com.dbs.calculate.MaxSatisfaction;
import com.dbs.inputData.InputData;

public class Satisfaction {

	public static void main(String[] args) {
		InputData i = new InputData ();
		
	       String obj1 = i.data.get(0); 
	       
	       //Splitting values into variables
	       int time = Integer.parseInt(obj1.split(" ")[0]);
	       int items = Integer.parseInt(obj1.split(" ")[1]);
	       
	       System.out.println("Complete time is = " + time);
	       System.out.println("Items given in number = " + items);
	       
	       i.data.remove(0); //Removing first element that is not required anymore
	       
	       int[] s = new int[items]; //Empty array each for values of satisfaction 
	       int[] t = new int[items]; //Empty array each for values of time 
	       
	       //filtering satisfaction and time into two arrays
	       for (int j = 0; j < items; j++) 
	       {
	           s[j] = Integer.parseInt(i.data.get(j).split(" ")[0]);
	           t[j] = Integer.parseInt(i.data.get(j).split(" ")[1]);
	       }
	       
	       //Calling calculate method from MaxSatisfaction class and invoke with above params
	       System.out.println("Maximum satisfaction that Gordon can get from eating at the restaurant is = " + MaxSatisfaction.calculate(time,t,s,items));
	       
        } 


	}