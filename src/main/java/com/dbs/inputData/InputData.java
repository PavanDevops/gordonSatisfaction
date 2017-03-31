/* Data Given as text file named as inputData.txt
 * Loading the text file into file object
 * Scanning the data from file object 
 * Reading the data from text file line by line
 */
package com.dbs.inputData;

import java.io.*;
import java.util.*;

public class InputData {
	File file = new File("inputData.txt");	//getting data from input file to file object
	public ArrayList<String> data = new ArrayList<String>(); 
	public ArrayList<String> data () {
		return data;
	}
    public InputData()
	{
	try {
	    Scanner scanner = new Scanner(file); // Creating Scanner Object to read the data from file
        
        while (scanner.hasNextLine()) 
        {
        	//Pull entries from file into ArrayList
            String line = scanner.nextLine(); 
            data.add(line);
        }
	scanner.close();
   	}
	catch (IOException e) 	{
        e.printStackTrace();
    }
}
}
