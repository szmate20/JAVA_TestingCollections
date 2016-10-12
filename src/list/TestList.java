package list;

import java.util.ArrayList;

class TestList {
	/*The list are maintain the 
	 * order of the insertion and each value gets an index,
	 * accept duplicates.*/
	
	public static void main(String[] args) {
		//Array list is not synchronized.
		
		ArrayList<String> testList = new ArrayList<>();
		
		//Array list values can be null.
		testList.add(null);
		testList.add("Two");
		testList.add("Two");
		testList.add("Three");
		
		//Since the list implements collection it can be iterated.
		
		System.out.println(testList.get(0));
		System.out.println(testList.get(1));
		System.out.println(testList.get(2));
		System.out.println(testList.get(3));
	}
}
