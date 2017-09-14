package myArrayList.test;

//Header to import supporting classes.
import myArrayList.MyArrayList;
import myArrayList.util.Results;

/*
* MyArrayListTest class.
* Created by Aravind Venkit for cs542 - Design patterns.
* MyArrayListTest class to test my array list data structure.
*/
public class MyArrayListTest{
	/*
	* MyArrayListTest constructor to intialize MyArrayListTest class.
	*/
	public MyArrayListTest(){
	}
	/*
	* testMe method.
	* testMe method to test my array list data structure.
	* Needs 2 arguments 1 -> MyArrayList class object, 2 -> Results class object.
	* In turn calls all the test case methods and strore the respective results.
	*/
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
	/*
	* insertCheck method.
	* insertCheck method to test insertSorted(int) method of myArrayList object.
	* To check whether values are inserted or not.
	* Needs 2 arguments 1 -> MyArrayList class object, 2 -> Results class object.
	* Stores test result in result object.
	*/
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
	/*
	* sizeCheck method.
	* sizeCheck method to test size() method of myArrayList object.
	* To check whether the method return correct size of my array list.
	* Needs 2 arguments 1 -> MyArrayList class object, 2 -> Results class object.
	* Stores test result in result object.
	*/
	private void sizeCheck(MyArrayList myArrayList, Results results){
		if(5 == myArrayList.size()){
			results.storeNewResult(1, "test sizeCheck passed");
		}else{
			results.storeNewResult(1, "test sizeCheck failed: size method in MyArrayList is failed");
		}
	}
	/*
	* sumCheck method.
	* sumCheck method to test sum() method of myArrayList object.
	* To check whether the method return correct sum all the elements in my array list.
	* Needs 2 arguments 1 -> MyArrayList class object, 2 -> Results class object.
	* Stores test result in result object.
	*/
	private void sumCheck(MyArrayList myArrayList, Results results){
		if((5+3+7+2+10) == myArrayList.sum()){
			results.storeNewResult(2, "test sumCheck passed");
		}else{
			results.storeNewResult(2, "test sumCheck failed: sum method in MyArrayList is failed");
		}
	}
	/*
	* indexOfCheck method.
	* indexOfCheck method to test indexOf(int) method of myArrayList object.
	* To check whether the method return correct index of passed value.
	* Needs 2 arguments 1 -> MyArrayList class object, 2 -> Results class object.
	* Stores test result in result object.
	*/
	private void indexOfCheck(MyArrayList myArrayList, Results results){
		if(0 == myArrayList.indexOf(2) && 2 == myArrayList.indexOf(5) 
			&& 4 == myArrayList.indexOf(10)){
			results.storeNewResult(3, "test indexOfCheck passed");
		}
		else{
			results.storeNewResult(3, "test indexOfCheck failed: indexOf method in MyArrayList is failed");
		}
	}
	/*
	* isSorted method.
	* isSorted method to test insertSorted(int) method of myArrayList object.
	* To check whether the insertSorted method insert value in sorting(ascending) order.
	* Needs 2 arguments 1 -> MyArrayList class object, 2 -> Results class object.
	* Stores test result in result object.
	*/
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
	/*
	* removeCheck method.
	* removeCheck method to test removeValue(int) method of myArrayList object.
	* To check whether the values are removed or not.
	* Needs 2 arguments 1 -> MyArrayList class object, 2 -> Results class object.
	* Stores test result in result object.
	*/
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
	/*
	* removeInvalidValue method.
	* removeInvalidValue method to test removeValue(int) method of myArrayList object.
	* To check whether the invalid value remove call does not affect the my array list.
	* Needs 2 arguments 1 -> MyArrayList class object, 2 -> Results class object.
	* Stores test result in result object.
	*/
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
	/*
	* insertDuplicateValue method.
	* insertDuplicateValue method to test insertSorted(int) method of myArrayList object.
	* To check whether the duplicate value is inserted or not.
	* Needs 2 arguments 1 -> MyArrayList class object, 2 -> Results class object.
	* Stores test result in result object.
	*/
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
	/*
	* removeOneOfDuplicateValue method.
	* removeOneOfDuplicateValue method to test removeValue(int) method of myArrayList object.
	* To check whether one of the duplicate value is removed or not.
	* Needs 2 arguments 1 -> MyArrayList class object, 2 -> Results class object.
	* Stores test result in result object.
	*/
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
	/*
	* intialBoundaryLimit method.
	* intialBoundaryLimit method to test insertSorted(int) method of myArrayList object.
	* To check whether intial limit of 50 elements can be inserted to my array list.
	* Needs 2 arguments 1 -> MyArrayList class object, 2 -> Results class object.
	* Stores test result in result object.
	*/
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
	/*
	* extendBoundaryCheck method.
	* extendBoundaryCheck method to test insertSorted(int) method of myArrayList object.
	* To check whether the extend above intial limit 50 is possible in my array list.
	* Needs 2 arguments 1 -> MyArrayList class object, 2 -> Results class object.
	* Stores test result in result object.
	*/
	private void extendBoundaryCheck(MyArrayList myArrayList, Results results){
		myArrayList.insertSorted(100);
		if(50 == myArrayList.indexOf(100)){
			results.storeNewResult(10, "test extendBoundaryCheck passed");
		}
		else{
			results.storeNewResult(10, "test extendBoundaryCheck failed: extend boundary above 50 is failed");
		}
	}
	/*
	* extendBoundaryLimit method.
	* extendBoundaryLimit method to test insertSorted(int) method of myArrayList object.
	* To check whether the extended limit of 75 elements can be inserted to my array list.
	* Needs 2 arguments 1 -> MyArrayList class object, 2 -> Results class object.
	* Stores test result in result object.
	*/
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