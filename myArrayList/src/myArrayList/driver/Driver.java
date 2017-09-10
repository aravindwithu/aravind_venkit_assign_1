package myArrayList.driver;

import myArrayList.MyArrayList;

public class Driver 
{

	public static void main(String[] args) 
	{
	    // command line validation is missing here. FIXME!
	    String pramStr = "", inputFile, outputFile;
	    if(0!= args.length){
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
	    if(pramStr != ""){
	    	System.out.println("Hello World: " + pramStr);
	    }

		MyArrayList myArrayList = new MyArrayList();
		myArrayList.insertSorted(5);
		myArrayList.toString(true);
	}
	
}
