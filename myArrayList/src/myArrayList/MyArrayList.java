package myArrayList;

//Header to import supporting classes.
import myArrayList.MyArrayList;

/*
* MyArrayList class.
* Created by Aravind Venkit for cs542 - Design patterns.
* MyArrayList class to implement my array list data structure.
*/
public class MyArrayList{
	private int maxIndex = 50;
	private int[] myArrayList = new int[maxIndex];
	/*
	* MyArrayList constructor to intialize MyArrayList class.
	* Calls intializeArray method.
	*/
	public MyArrayList(){
		intializeArray();
	}
	/*
	* intializeArray method.
	* intializes resultArray with -1 value.
	*/
	private void intializeArray(){
		for(int i=0; i < myArrayList.length; i++){
			myArrayList[i] = -1;
		}
	}
	/*
	* insertSorted public method.
	* Inserts value to my array list.
	* Needs 1 arguments 1 -> int newValue.
	* In turn calls insertSorted private method.
	*/
	public void insertSorted(int newValue){
		if(myArrayList[myArrayList.length-1] != -1){
			if(extendArray()){
				insertSorted(0, newValue);
			}
		}else{
			insertSorted(0, newValue);
		}
	}
	/*
	* insertSorted private method.
	* Inserts value to my array list in sorted order.
	* Needs 1 arguments 1 -> int newValue.
	* Sorting is based on insert sort but inserts value in sort order.
	* i.e. If there is no value in index 0 the value is inserted in index 0 of myArrayList.
	* If the index is not 0 and the myArrayList value is -1, the the -1 is replaced with new value in myArrayList.
	* If there is any other value and if myArrayList value is greater than new value, then the myArrayList value is stored in temp variable and myArrayList value is replaced with new value.
	* The consecutive values are moved to respective next index.
	*/
	private void insertSorted(int index, int value){
		for(int i=index; i < myArrayList.length; i++){
			if(0 == i && -1 == myArrayList[i]){
				myArrayList[i] = value;
				break;
			}
			else if(-1 != myArrayList[i] && myArrayList[i] > value){
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
	/*
	* extendArray method.
	* Extends my array list by 50%.
	* Once extended the method returns true.
	*/
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
	/*
	* toString method.
	* To print the values of the my array list.
	* get one argument to override default toString function 1.-> boolean print.
	* Once extended the method returns true.
	*/
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
	/*
	* removeValue method.
	* Removes value from my array list.
	* Needs 1 arguments 1 -> int newValue.
	*/
	public void removeValue(int value){
		for(int i = 0; i < myArrayList.length; i++){
			if(value == myArrayList[i]){
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
			}
		}
	}
	/*
	* indexOf method.
	* Needs 1 arguments 1 -> int value.
	* Returns index of the given value.
	*/
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
	/*
	* size method.
	* Returns size of the my array list.
	*/
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
	/*
	* sum method.
	* Returns sum of all the elements in my array list.
	*/
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