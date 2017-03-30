package com.dbs.inputData;

import java.io.*;
import java.util.*;

public class InputData {
	File file = new File("inputData.txt");	
	public ArrayList<String> data = new ArrayList(); 
	public ArrayList<String> data () {
		return data;
	}
	try {
	    Scanner scanner = new Scanner(file);
        
        while (scanner.hasNextLine()) 
        {
            String line = scanner.nextLine(); //Read entries from file into ArrayList
            data.add(line);
        }
   	}
	catch (IOException e) 	{
        e.printStackTrace();
    }
}
}
