package myArrayList.driver;

import myArrayList.MyArrayList;

public class Driver 
{

	public static void main(String[] args) 
	{
	    // command line validation is missing here. FIXME!
	    //System.out.println("Hello World: " + args[0] + ", " + args[1] + ", " + args[2]);
		MyArrayList myArrayList = new MyArrayList();

		myArrayList.insertSorted(5);
		myArrayList.displayArray(true);
	}
	
}
