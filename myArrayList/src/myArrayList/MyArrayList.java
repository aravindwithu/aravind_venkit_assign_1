package myArrayList;

import java.io.*;
import java.util.*;

public class MyArrayList{
	private int[] myArrayList = new int[5];

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

	private void insertSorted(int index, int value){
		for(int i=index; i < myArrayList.length; i++){
			if(0 == i && -1 == myArrayList[i]){
				myArrayList[i] = value;
				break;
			}
			else if(-1 != myArrayList[i] && myArrayList[i]>value){
				int tempValue = myArrayList[i];
				myArrayList[i] = value;
				insertSorted(i+1, tempValue);
				break;
			}
			else if(-1 == myArrayList[i]){
				myArrayList[i] = value;
				break;
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

	/*public void removeValue(int value){
		for(int i=0; i < myArrayList.length; i++){
			if(value == myArrayList[i]){
				myArrayList[i] = -1;
				removeSorted(i, myArrayList[i+1]);
			}
		}
	}

	private void removeSorted(int i, int value){
		for(int i=0; i < myArrayList.length; i++){
			if(value == myArrayList[i]){
				myArrayList[i] = -1;
				removeSorted(i, myArrayList[i+1]);
			}
		}
	}*/

	public int indexOf(int value){
		for(int i=0; i < myArrayList.length; i++){
			if(-1 != myArrayList[i]){
				if(value == myArrayList[i]){
					return i;
				}
			}
			else{
				return -1;
			}
		}
		return -2;
	}

	public int size(){
		int size = 0;
		for(int i=0; i < myArrayList.length; i++){
			if(-1 != myArrayList[i]){
				size += 1;
			}
			else{
				break;
			}
		}
		return size;
	}

	public int sum(){
		int sum = 0;
		for(int i=0; i < myArrayList.length; i++){
			if(-1 != myArrayList[i]){
				sum += myArrayList[i];
			}
			else{
				break;
			}
		}
		return sum;
	}
}
