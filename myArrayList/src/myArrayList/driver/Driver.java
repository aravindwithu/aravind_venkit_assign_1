package myArrayList.driver;

import myArrayList.MyArrayList;
import myArrayList.util.Results;
import myArrayList.test.MyArrayListTest;
import myArrayList.util.FileProcessor;

public class Driver 
{
	public static void main(String[] args) 
	{
	    // command line validation is missing here. FIXME!
	    //try(){
	    	String pramStr = "", inputFile = "", outputFile = "";
		    if(0 != args.length){
		    	if(!args[0].equals("${arg0}")){
		    		pramStr += args[0] + ", ";
		    		inputFile = args[0];
		    	}
		    	else{

		    	}
		    	if(!args[1].equals("${arg1}")){
					pramStr += args[1];
					outputFile = args[1];
		    	}
		    	else{

		    	}
		    }
		    else{
		    	//throw new MyException("Please pass exactly 2 arguments one for input and another for output files.");
		    }

		    if(pramStr != ""){
		    	System.out.println("Hello World: " + pramStr);
		    }

		    MyArrayList myArrayList = new MyArrayList();
			Results results = new Results();
			MyArrayListTest myArrayListTest = new MyArrayListTest();
			myArrayListTest.testMe(myArrayList, results);
			results.printAll();
			myArrayList = null;
			myArrayList = new MyArrayList();

			FileProcessor file = new FileProcessor(inputFile);
			String line;
		    while ((line = file.readLine(true)) != null)
		    {
		    	int newValue =  Integer.parseInt(line);
		    	myArrayList.insertSorted(newValue);
		    }
		    file.readLine(false);

		    myArrayList.toString(true);

		    int sumValue = myArrayList.sum();

		    System.out.println("sum value is " + sumValue);
	   // }
	    /*catch(exception ex){
	    	System.err.format(ex.getMessage());
	    	ex.printStackTrace();
	    }*/
	}
}