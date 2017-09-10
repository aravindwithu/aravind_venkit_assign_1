package myArrayList;

import java.io.*;
import java.util.*;

public class MyArrayList{
	private int[] myArrayList = new int[50];

	public MyArrayList(){
		intializeArray();
	}

	private void intializeArray(){
		for(int i=0; i < myArrayList.length; i++){
			myArrayList[i] = -1;
		}
	}

	public void insertSorted(int newValue){
		insertSorted(0, newValue);
	}

	private void insertSorted(int i, int newValue){
		for(i=0; i < myArrayList.length; i++){
			if(0 == i && -1 == myArrayList[i]){
				myArrayList[i] = newValue;
				break;
			}
			else if(-1 != myArrayList[i] && myArrayList[i]>newValue){
				int tempValue = myArrayList[i]; 
				myArrayList[i] = newValue;
				insertSorted(i+1, tempValue);
			}
			else if(-1 == myArrayList[i]){
				myArrayList[i] = newValue;
			}
		}
	}

	public void toString(boolean print){
		if(print){
			for(int i=0; i<myArrayList.length; i++){
				if(-1 != myArrayList[i]){
					System.out.println(myArrayList[i]);
				}
				else{
					break;
				}
			}
		}
	}

	public void removeValue(int value){

	}

	public int indexOf(int value){
		for(int i=0; i < myArrayList.length; i++){
			if(value == myArrayList[i]){
				return value;
			}
		}
		return -1;
	}

	public int size(){
		return 0;
	}

	public int sum(){
		return 0;
	}
}
