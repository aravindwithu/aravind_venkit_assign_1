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
		boundaryCheck(myArrayList, results);
	}

	private void insertCheck(MyArrayList myArrayList, Results results){
		myArrayList.insertSorted(5);
		myArrayList.insertSorted(3);
		myArrayList.insertSorted(7);
		myArrayList.insertSorted(2);
		myArrayList.insertSorted(10);

		if(0 == myArrayList.indexOf(2) && 2 == myArrayList.indexOf(5) 
			&& 4 == myArrayList.indexOf(10)){
			results.storeNewResult(0, "insertCheck~passed~insertSorted function in MyArrayList is passed");
		}
		else{
			results.storeNewResult(0, "insertCheck~failed~insertSorted function in MyArrayList is failed");
		}
	}

	private void sizeCheck(MyArrayList myArrayList, Results results){
		if(5 == myArrayList.size()){
			results.storeNewResult(1, "sizeCheck~passed~size function in MyArrayList is passed");
		}else{
			results.storeNewResult(1, "sizeCheck~failed~size function in MyArrayList is failed");
		}
	}

	private void sumCheck(MyArrayList myArrayList, Results results){
		if((5+3+7+2+10) == myArrayList.size()){
			results.storeNewResult(2, "sumCheck~passed~sum function in MyArrayList is passed");
		}else{
			results.storeNewResult(2, "sumCheck~failed~sum function in MyArrayList is failed");
		}
	}

	private void indexOfCheck(MyArrayList myArrayList, Results results){
		if(0 == myArrayList.indexOf(2) && 2 == myArrayList.indexOf(5) 
			&& 4 == myArrayList.indexOf(10)){
			results.storeNewResult(3, "indexOfCheck~passed~indexOf function in MyArrayList is passed");
		}
		else{
			results.storeNewResult(3, "indexOfCheck~failed~indexOf function in MyArrayList is failed");
		}
	}

	private void isSorted(MyArrayList myArrayList, Results results){
		if(0 == myArrayList.indexOf(2) && 1 == myArrayList.indexOf(3) 
			&& 2 == myArrayList.indexOf(5) && 3 == myArrayList.indexOf(7) 
			&& 4 == myArrayList.indexOf(10)){
			results.storeNewResult(4, "isSorted~passed~insert element are in sorted form - passed");
		}
		else{
			results.storeNewResult(4, "isSorted~failed~insert element are not in sorted form - failed");
		}
	}

	private void removeCheck(MyArrayList myArrayList, Results results){
		myArrayList.removeValue(10);
		myArrayList.removeValue(5);
		myArrayList.removeValue(2);

		if(0 == myArrayList.indexOf(3) && 2 == myArrayList.size()){
			results.storeNewResult(5, "removeCheck~passed~removeValue function passed");
		}
		else{
			results.storeNewResult(5, "removeCheck~failed~removeValue function failed");
		}
	}

	private void boundaryCheck(MyArrayList myArrayList, Results results){
		int initialVal = 1;
		int maxArraySize = 50 - myArrayList.size();
		for(int i = 0; i < maxArraySize; i++){
			myArrayList.insertSorted(initialVal);
			initialVal++;;
		}

		if(50 == myArrayList.size()){
			results.storeNewResult(6, "boundaryCheck~passed~boundaryCheck for intial max index(50) of array passed");
		}
		else{
			results.storeNewResult(6, "boundaryCheck~failed~boundaryCheck for intial max index(50) of array failed");
		}
	}

	private void invalidBoundaryCheck(MyArrayList myArrayList, Results results){
	
	}

	private void extendBoundaryCheck(MyArrayList myArrayList, Results results){
		
	}
}