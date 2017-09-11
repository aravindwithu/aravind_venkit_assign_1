package myArrayList.util;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileProcessor{
	private BufferedReader file;
	private boolean isFileOpen = false;

	public FileProcessor(String filename){
		try{
			file = new BufferedReader(new FileReader(filename));
			isFileOpen = true;
		}
		catch (Exception ex)
	  	{
	    	System.err.format(ex.getMessage());
	    	ex.printStackTrace();
	  	}
	}

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
	    	System.err.format(ex.getMessage());
	    	ex.printStackTrace();
	    	return null;
	  	}
	}

	private void closeFile(){
		try{
			file.close();
			isFileOpen = false;
		}
		catch (Exception ex)
	  	{
	    	System.err.format(ex.getMessage());
	    	ex.printStackTrace();
	  	}
	}
}