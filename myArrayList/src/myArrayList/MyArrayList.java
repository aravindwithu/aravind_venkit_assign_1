package myArrayList;

import java.io.*;
import java.util.*;

public class MyArrayList{
	private int maxIndex = 50;
	private int[] myArrayList = new int[maxIndex];

	public MyArrayList(){
		intializeArray();
	}

	private void intializeArray(){
		for(int i=0; i < myArrayList.length; i++){
			myArrayList[i] = -1;
		}
	}

	public void insertSorted(int newValue){
		if(myArrayList[myArrayList.length-1] != -1){
			if(extendArray()){
				insertSorted(0, newValue);
			}
		}else{
			insertSorted(0, newValue);
		}
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

	private boolean extendArray(){
		int[] tempArray = new int[maxIndex];
		tempArray = myArrayList;

 		maxIndex += (maxIndex/2);

		myArrayList = new int[maxIndex];
		intializeArray();
		for(int i=0; i < tempArray.length; i++){
			myArrayList[i] = tempArray[i];
		}
		return true;
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
		for(int i = 0; i < myArrayList.length; i++){
			if(value == myArrayList[i]){
<<<<<<< HEAD
				myArrayList[i] = -1;				
				for(int j = i; j < myArrayList.length-1; j++){
					if(-1 != myArrayList[j+1]){
						myArrayList[j] = myArrayList[j+1];
						if(j+1 == myArrayList.length-1){
							myArrayList[j+1] = -1;
						}					
					}
					else{
						myArrayList[j] = -1;
						break;
					}	
				}			
				break;
=======
				myArrayList[i] = -1;
				removeSorted(i, myArrayList[i+1]);
>>>>>>> bc57688403c70351305ca08aff062fa157c9828d
			}
		}
	}

<<<<<<< HEAD
=======
	private void removeSorted(int i, int value){
		for(int i=0; i < myArrayList.length; i++){
			if(value == myArrayList[i]){
				myArrayList[i] = -1;
				removeSorted(i, myArrayList[i+1]);
			}
		}
	}*/

>>>>>>> bc57688403c70351305ca08aff062fa157c9828d
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