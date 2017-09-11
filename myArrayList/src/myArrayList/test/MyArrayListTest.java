package myArrayList.test;

import myArrayList.MyArrayList;

public class MyArrayListTest{
	private String[] resultArray = new String[10];
	private MyArrayList myArrayList = new MyArrayList();

	public MyArrayListTest(){
		intializeArray();
	}

	private void intializeArray(){
		for(int i=0; i < resultArray.length; i++){
			resultArray[i] = null;
		}
	}

	public void testMe(){

	}

	private void insertCheck(){
		myArrayList.insertSorted(5);
		myArrayList.insertSorted(3);
		myArrayList.insertSorted(7);
		myArrayList.insertSorted(2);
		myArrayList.insertSorted(10);

		if(0 == myArrayList.indexOf(2) && 2 == myArrayList.indexOf(5) 
			&& 4 == myArrayList.indexOf(10)){
			resultArray[0] = "insertCheck~passed~insertSorted function in MyArrayList is passed";
		}
		else{
			resultArray[0] = "insertCheck~failed~insertSorted function in MyArrayList is failed";
		}
	}

	private void sizeCheck(){
		if(5 == myArrayList.size()){
			resultArray[1] = "sizeCheck~passed~size function in MyArrayList is passed";
		}else{
			resultArray[1] = "sizeCheck~failed~size function in MyArrayList is failed";
		}
	}

	private void sumCheck(){
		if((5+3+7+2+10) == myArrayList.size()){
			resultArray[2] = "sumCheck~passed~sum function in MyArrayList is passed";
		}else{
			resultArray[2] = "sumCheck~failed~sum function in MyArrayList is failed";
		}
	}

	private void indexOfCheck(){
		if(0 == myArrayList.indexOf(2) && 2 == myArrayList.indexOf(5) 
			&& 4 == myArrayList.indexOf(10)){
			resultArray[3] = "indexOfCheck~passed~indexOf function in MyArrayList is passed";
		}
		else{
			resultArray[3] = "indexOfCheck~failed~indexOf function in MyArrayList is failed";
		}
	}

	private void isSorted(){
		if(0 == myArrayList.indexOf(2) && 1 == myArrayList.indexOf(3) 
			&& 2 == myArrayList.indexOf(5) && 3 == myArrayList.indexOf(7) 
			&& 4 == myArrayList.indexOf(10)){
			resultArray[4] = "isSorted~passed~insert element are in sorted form - passed";
		}
		else{
			resultArray[4] = "isSorted~failed~insert element are not in sorted form - failed";
		}
	}

	private void removeCheck(){

	}

	private void boundaryCheck(){
	}
}