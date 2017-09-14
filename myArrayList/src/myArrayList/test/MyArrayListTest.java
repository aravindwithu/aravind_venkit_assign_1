package myArrayList.test;

import myArrayList.MyArrayList;
import myArrayList.util.Results;

public class MyArrayListTest{

	public MyArrayListTest(){
	}

	public void testMe(MyArrayList myArrayList, Results results){
		insertCheck(myArrayList, results);
		sizeCheck(myArrayList, results);
		sumCheck(myArrayList, results);
		indexOfCheck(myArrayList, results); 
		isSorted(myArrayList, results);
		removeCheck(myArrayList, results);
		removeInvalidValue(myArrayList, results);
		insertDuplicateValue(myArrayList, results);
		removeOneOfDuplicateValue(myArrayList, results);
		intialBoundaryLimit(myArrayList, results);
		extendBoundaryCheck(myArrayList, results);
		extendBoundaryLimit(myArrayList, results);
	}

	private void insertCheck(MyArrayList myArrayList, Results results){
		myArrayList.insertSorted(5);
		myArrayList.insertSorted(3);
		myArrayList.insertSorted(7);
		myArrayList.insertSorted(2);
		myArrayList.insertSorted(10);

		if(0 == myArrayList.indexOf(2) && 2 == myArrayList.indexOf(5) 
			&& 4 == myArrayList.indexOf(10)){
			results.storeNewResult(0, "test insertCheck passed");
		}
		else{
			results.storeNewResult(0, "test insertCheck failed: insertSorted function in MyArrayList is failed");
		}
	}

	private void sizeCheck(MyArrayList myArrayList, Results results){
		if(5 == myArrayList.size()){
			results.storeNewResult(1, "test sizeCheck passed");
		}else{
			results.storeNewResult(1, "test sizeCheck failed: size function in MyArrayList is failed");
		}
	}

	private void sumCheck(MyArrayList myArrayList, Results results){
		if((5+3+7+2+10) == myArrayList.sum()){
			results.storeNewResult(2, "test sumCheck passed");
		}else{
			results.storeNewResult(2, "test sumCheck failed: sum function in MyArrayList is failed");
		}
	}

	private void indexOfCheck(MyArrayList myArrayList, Results results){
		if(0 == myArrayList.indexOf(2) && 2 == myArrayList.indexOf(5) 
			&& 4 == myArrayList.indexOf(10)){
			results.storeNewResult(3, "test indexOfCheck passed");
		}
		else{
			results.storeNewResult(3, "test indexOfCheck failed: indexOf function in MyArrayList is failed");
		}
	}

	private void isSorted(MyArrayList myArrayList, Results results){
		if(0 == myArrayList.indexOf(2) && 1 == myArrayList.indexOf(3) 
			&& 2 == myArrayList.indexOf(5) && 3 == myArrayList.indexOf(7) 
			&& 4 == myArrayList.indexOf(10)){
			results.storeNewResult(4, "test isSorted passed");
		}
		else{
			results.storeNewResult(4, "test isSorted failed: insert element are not in sorted form");
		}
	}

	private void removeCheck(MyArrayList myArrayList, Results results){
		myArrayList.removeValue(10);
		myArrayList.removeValue(5);
		myArrayList.removeValue(2);

		if(0 == myArrayList.indexOf(3) && 2 == myArrayList.size()){
			results.storeNewResult(5, "test removeCheck passed");
		}
		else{
			results.storeNewResult(5, "test removeCheck failed: removeValue function failed");
		}
	}

	private void removeInvalidValue(MyArrayList myArrayList, Results results){
		int initialSize = myArrayList.size();
		myArrayList.removeValue(10);

		if(initialSize == myArrayList.size()){
			results.storeNewResult(6, "test removeInvalidValue passed");
		}
		else{
			results.storeNewResult(6, "test removeInvalidValue failed: when tried to remove invalid Value, the array is altered");
		}
	}

	private void insertDuplicateValue(MyArrayList myArrayList, Results results){
		int initialSize = myArrayList.size();
		myArrayList.insertSorted(3);
		if((initialSize+1) == myArrayList.size()){
			results.storeNewResult(7, "test insertDuplicateValue passed");
		}
		else{
			results.storeNewResult(7, "test insertDuplicateValue failed: insert duplicate value is failed");
		}
	}

	private void removeOneOfDuplicateValue(MyArrayList myArrayList, Results results){
		int initialSize = myArrayList.size();
		myArrayList.removeValue(3);
		if((initialSize-1) == myArrayList.size()){
			results.storeNewResult(8, "test removeOneOfDuplicateValue passed");
		}
		else{
			results.storeNewResult(8, "test removeOneOfDuplicateValue failed: remove one of duplicate Value is failed");
		}
	}

	private void intialBoundaryLimit(MyArrayList myArrayList, Results results){
		int initialVal = 1;
		int maxArraySize = 50 - myArrayList.size();
		for(int i = 0; i < maxArraySize; i++){
			myArrayList.insertSorted(initialVal);
			initialVal++;
		}

		if(50 == myArrayList.size()){
			results.storeNewResult(9, "test intialBoundaryLimit passed");
		}
		else{
			results.storeNewResult(9, "test intialBoundaryLimit failed: intial boundary limit(50) of array is failed");
		}
	}

	private void extendBoundaryCheck(MyArrayList myArrayList, Results results){
		myArrayList.insertSorted(100);
		if(50 == myArrayList.indexOf(100)){
			results.storeNewResult(10, "test extendBoundaryCheck passed");
		}
		else{
			results.storeNewResult(10, "test extendBoundaryCheck failed: extend boundary above 50 is failed");
		}
	}

	private void extendBoundaryLimit(MyArrayList myArrayList, Results results){
		int initialVal = 50;
		int maxArraySize = 75 - myArrayList.size();
		for(int i = 0; i < maxArraySize; i++){
			myArrayList.insertSorted(initialVal);
			initialVal++;;
		}

		if(75 == myArrayList.size()){
			results.storeNewResult(11, "test extendBoundaryLimit passed");
		}
		else{
			results.storeNewResult(11, "test extendBoundaryLimit failed: extend boundary limit(75) of array is failed");
		}
	}
}