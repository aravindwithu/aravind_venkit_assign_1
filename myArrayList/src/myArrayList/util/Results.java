package myArrayList.util;

public class Results{
	private String[] resultArray = new String[10];

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
			System.out.println(resultArray[i]);
		}
	}
}