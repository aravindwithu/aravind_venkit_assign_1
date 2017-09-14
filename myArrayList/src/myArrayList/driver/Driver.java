package myArrayList.driver;

//Header to import supporting classes.
import myArrayList.MyArrayList;
import myArrayList.util.Results;
import myArrayList.test.MyArrayListTest;
import myArrayList.util.FileProcessor;
import java.io.PrintWriter;

/*
* Driver class contains main method.
* Created by Aravind Venkit for cs542 - Design patterns.
* Driver class to test, use my array list data structure.
* Needs 2 command line arguments 1 -> input file, 2 -> output file.
* An otput file is generated with given output file name, which contains sum and test case results.
*/
public class Driver 
{
	public static void main(String[] args) 
	{
	    // command line validation for input file and output file respectively.
	    try{
	    	String inputFile = "", outputFile = "";
		    if(2 == args.length){//validates given arguments array length to 2
		    	if(!args[0].equals("${arg0}")){//validates 1st input file argument value
		    		inputFile = args[0];
		    	}
		    	else{
		    		throw new Exception("Please provide input file.");
		    	}
		    	if(!args[1].equals("${arg1}")){//validates 2nd output file argument value
					outputFile = args[1];
		    	}
		    	else{
		    		throw new Exception("Please provide output file.");
		    	}
		    }
		    else{
		    	throw new Exception("Please pass exactly 2 arguments one for input and another for output files.");
		    }

		    MyArrayList myArrayList = new MyArrayList();
			Results results = new Results();
			MyArrayListTest myArrayListTest = new MyArrayListTest();
			myArrayListTest.testMe(myArrayList, results);
			myArrayList = null;
			myArrayList = new MyArrayList();
			FileProcessor file = new FileProcessor(inputFile);
			String line;
		    while ((line = file.readLine(true)) != null)
		    {
		    	try{
		    		int newValue =  Integer.parseInt(line);
		    		if(0 <= newValue && 10000 >= newValue){
		    			myArrayList.insertSorted(newValue);
		    		}else{
		    			throw new Exception("Invalid value: "+ newValue +", Please provide number numbers in the range 0-10000.");
		    		}
		    	}
		    	catch(Exception ex){
		    		throw new Exception("Invalid value: "+ line +", Please provide numbers in the range 0-10000.");
		    	}
		    }
		    file.readLine(false);

		    int sumValue = myArrayList.sum();
		    results.printAll();

		   	PrintWriter writer = new PrintWriter(outputFile, "UTF-8");
		    writer.println("The sum of all the values in the array list is: " + sumValue);
		    results.writeAll(writer);
		    writer.close();
	    }
	    catch(Exception ex){
	    	System.err.println(ex.getMessage());
	    	ex.printStackTrace();
	    	System.exit(0);
	    }
	}
}