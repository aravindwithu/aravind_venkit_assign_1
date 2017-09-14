package myArrayList.util;

import java.io.PrintWriter;

public class Results implements FileDisplayInterface, StdoutDisplayInterface{
	private String[] resultArray = new String[12];
	private PrintWriter writer;

	public Results(){
		intializeArray();
	}

	private void intializeArray(){
		for(int i=0; i < resultArray.length; i++){
			resultArray[i] = "";
		}
	}

	public void storeNewResult(int index, String value){
		resultArray[index] = value;
	}

	public void printAll(){
		for(int i = 0; i < resultArray.length; i++){
			writeToStdout(resultArray[i]);
		}
	}

	public void writeAll(PrintWriter writer_in){
		writer = writer_in;
		for(int i = 0; i < resultArray.length; i++){
			writeToFile(resultArray[i]);
		}
	}

	public void writeToStdout(String s){
		System.out.println(s);
	}

	public void writeToFile(String s){
			writer.println(s);
	}
}