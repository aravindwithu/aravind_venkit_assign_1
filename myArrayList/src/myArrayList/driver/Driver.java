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

		System.out.println("first");
		myArrayList.insertSorted(5);
		myArrayList.toString(true);

		System.out.println("secound");
		myArrayList.insertSorted(3);
		myArrayList.toString(true);

		System.out.println("third");
		myArrayList.insertSorted(7);
		myArrayList.toString(true);

		System.out.println("fourth");
		myArrayList.insertSorted(2);
		myArrayList.toString(true);

		System.out.println("fifth");
		myArrayList.insertSorted(10);
		myArrayList.toString(true);

		System.out.println("size is "+myArrayList.size());
		System.out.println("sum is "+myArrayList.sum());

		System.out.println("index of 7 is "+myArrayList.indexOf(7));

		System.out.println("index of 10 is "+myArrayList.indexOf(10));
	}
	
}
