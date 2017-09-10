import java.io.*;
import java.util.*;

public class MyArrayList {
	private static int[] myArrayList = new int[50];

	private static void intializeArray(){
		for(int i=0; i < myArrayList.length; i++){
			myArrayList[i] = -1;
		}
	}

	public static void insertSorted(int newValue){
		insertSorted(0, newValue);
	}

	private static void insertSorted(int i, int newValue){
		for(i=0; i < myArrayList.length; i++){
			if(0 == i && -1 == myArrayList[i]){
				myArrayList[i] = newValue;
				break;
			}
			else if(-1 != myArrayList[i] && myArrayList[i] > newValue){
				int tempValue = myArrayList[i]; 
				myArrayList[i] = newValue;
				insertSorted(i+1, tempValue);
			}
			else if(-1 == myArrayList[i]){
				myArrayList[i] = newValue;
			}
		}
	}

	public static void displayArray(){
		for(int i=0; i<myArrayList.length; i++){
			if(-1 != myArrayList[i]){
				System.out.println(myArrayList[i]);
			}
			else{
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		intializeArray();
		insertSorted(5);
		displayArray();
  	}
}