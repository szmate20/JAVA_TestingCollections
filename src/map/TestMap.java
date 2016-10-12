package map;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class TestMap {
	/*Maps are key-value pairs u can access the values by the keys,
	 *  keys are unique and are stored in Sets.*/
	public static void main(String[] args) {
			/*Note that this implementation is not synchronized,
			 *  the synchronized implementation is HashTable*/
			Map<Integer, String> testMap = new HashMap<>();
			
			//Allows null.
			testMap.put(null, null);
			testMap.put(1, "Two");
			
			//Overwrite the value with the same key.
			testMap.put(1, "Three");
			
			for (Integer integ : testMap.keySet()) {
				System.out.println(testMap.get(integ));
			}
		//-------------------------------------------------------------
			//Note that this implementation is not synchronized.
			//Maintain the natural order of the keys.
			SortedMap<Integer, String> testMap2 = new TreeMap<>();
			
			//Allow null value.
			testMap2.put(2, null);
			testMap2.put(1, "One");
			testMap2.put(3, "Three");
			
			//Does NOT allow null keys.
			//testMap2.put(null, "asd");
			
			System.out.println();
			for (Integer integ : testMap2.keySet()) {
				System.out.println(testMap2.get(integ));
			}
		
	}
}
