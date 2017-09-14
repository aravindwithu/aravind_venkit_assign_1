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
		    if(2 == args.length){// validates given arguments array length to 2.
		    	if(!args[0].equals("${arg0}")){// validates 1st input file argument value.
		    		inputFile = args[0];
		    	}
		    	else{
		    		throw new Exception("Please provide input file.");
		    	}
		    	if(!args[1].equals("${arg1}")){// validates 2nd output file argument value.
					outputFile = args[1];
		    	}
		    	else{
		    		throw new Exception("Please provide output file.");
		    	}
		    }
		    else{
		    	throw new Exception("Please pass exactly 2 arguments one for input and another for output files.");
		    }

		    // Object created for MyArrayList class.
		    MyArrayList myArrayList = new MyArrayList();
		    // Object created for Results class.
			Results results = new Results();
			// Object created for MyArrayListTest class.
			MyArrayListTest myArrayListTest = new MyArrayListTest();
			// testMe method from MyArrayListTest cass is called with 2 arguments myArrayList and results objects respectively.
			// To validate the test cases and to store respective results.
			myArrayListTest.testMe(myArrayList, results);
			// Prints all the test results.
		    results.printAll();
			// Once test case were validated the myArrayList object is re intialized with new MyArrayList class object.
			myArrayList = null;
			myArrayList = new MyArrayList();

			// Object created for FileProcessor with respective input file.
			FileProcessor file = new FileProcessor(inputFile);
			// The input values are read from file and stored in my array list.
			String line;
		    while ((line = file.readLine(true)) != null)
		    {
		    	try{
		    		int newValue =  Integer.parseInt(line);
		    		// Validates the value from input file one by one.
		    		if(0 <= newValue && 10000 >= newValue){
		    			myArrayList.insertSorted(newValue);// value is inserted in sorted order(asc).
		    		}else{
		    			throw new Exception("Invalid value: "+ newValue +", Please provide number numbers in the range 0-10000.");
		    		}
		    	}
		    	catch(Exception ex){// To catch the in parse invalid error.
		    		throw new Exception("Invalid value: "+ line +", Please provide numbers in the range 0-10000.");
		    	}
		    }
		    file.readLine(false);

		    // gets and store the sum of the values in my array in sumValue variable.
		    int sumValue = myArrayList.sum();

		    // Object for PrintWriter is created with respective output file name and encoding format.
		   	PrintWriter writer = new PrintWriter(outputFile, "UTF-8");
		   	// Writes the sum value to output file.
		    writer.println("The sum of all the values in the array list is: " + sumValue);
		    // writeAll method from Results class is called with writer object to write the test case results to the output file.
		    results.writeAll(writer);
		    // writer object is closed.
		    writer.close();
	    }
	    catch(Exception ex){
	    	System.err.println(ex.getMessage());// prints the error message.
	    	ex.printStackTrace();// prints stack trace.
	    	System.exit(0);
	    }
	    finally{
	    	myArrayList = null;
	    	results = null;
	    	myArrayListTest = null;
	    	file = null;
	    	writer = null;
	    }
	}
}