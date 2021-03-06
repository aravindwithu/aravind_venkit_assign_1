package myArrayList.util;

//Header to import supporting classes.
import java.io.BufferedReader;
import java.io.FileReader;

/*
* FileProcessor class.
* Created by Aravind Venkit for cs542 - Design patterns.
* FileProcessor class to process file.
*/
public class FileProcessor{
	private BufferedReader file; // BufferedReader object to read from file.
	private boolean isFileOpen = false;//  to maintain whether the file is open or not state.
	/*
	* FileProcessor constructor to intialize FileProcessor class.
	* Requires input file name to intialize the BufferedReader object.
	* Exception is thrown if given file does not exits.
	*/
	public FileProcessor(String filename){
		try{
			file = new BufferedReader(new FileReader(filename));
			isFileOpen = true;
		}
		catch (Exception ex)
	  	{
	    	System.err.println(ex.getMessage());
	    	ex.printStackTrace();
	    	System.exit(0);
	  	}
	}
	/*
	* readLine method.
	* Reads the line from file.
	* Needs 1 arguments 1 -> boolean read.
	* If read is true then readLine() is returned else file object is closed.
	*/
	public String readLine(boolean read){
		try{
			if(isFileOpen){
				if(read){
					return file.readLine();
				}else{
					closeFile();
					return "file closed sucessfully";
				}
			}else{
				return "file is in closed state";
			}
		}
		catch (Exception ex)
	  	{
	    	System.err.println(ex.getMessage());
	    	ex.printStackTrace();
	    	System.exit(0);
	    	return null;
	  	}
	}

	/*
	* closeFile method.
	* closes the file object.
	*/
	private void closeFile(){
		try{
			file.close();
			isFileOpen = false;
		}
		catch (Exception ex)
	  	{
	    	System.err.println(ex.getMessage());
	    	ex.printStackTrace();
	    	System.exit(0);
	  	}
	  	finally{
	  		file = null;
	  	}
	}
}