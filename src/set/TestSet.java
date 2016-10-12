package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class TestSet {
	/*The main functionality of the set collection 
	 *implementation that its not allow duplications and its not indexed.*/
	
	public static void main(String[] args) {
			/*HashSet is unordered its use hash code 
			 *to check two value before calling equals.*/
			//The hashSet is not synchronized.
			Set<String> testSet = new HashSet<>();
			
			//The hash set allow null value
			testSet.add(null);
			testSet.add("22");
			testSet.add("3");
			//The three gets overwritten.
			/*Since this is a hash implementation its check the hash code if
			 *its identical its call the equals. If equals return true 
			 *its overwrite the one in the set*/
			testSet.add("3");
			
			for (String strg : testSet) {
				System.out.println(strg);
			}
			
			System.out.println("\n");
		
		//-----------------------------------------------------------------
		
			/*TreeSet order the set by the natural 
			 * order of the given class, the given class must 
			 * implement Comparable interface because its using the 
			 * comperTo method to order the elements.*/
			//The treeSet is not synchronized.
			Set<Integer> testSet2 = new TreeSet<>();
			
			//Tree set does not allow null value.
			testSet2.add(1);
			testSet2.add(22);
			testSet2.add(3);
			//The three gets overwritten.
			/*The set calls the equals method of 
			 * the value class and overwrite the one 
			 * in the set if the two are identical.*/
			testSet2.add(3);
			
			for (Integer inte : testSet2) {
				System.out.println(inte);
			}
			
			System.out.println("\n");
		
		//-----------------------------------------------------------------
			/*The LinkedHashSet keep the order of the value insertion */
			//The LinkedHashSet is NOT synchronized.
			Set<Integer> testSet3 = new LinkedHashSet<>();
			
			//The linked hash set allow null value.
			testSet3.add(null);
			testSet3.add(22);
			testSet3.add(3);
			testSet3.add(104);
			//The three gets overwritten.
			/*The set calls the equals method of 
			 * the value class and overwrite the one 
			 * in the set if the two are identical.*/
			testSet3.add(23);
			/*Note that this got inserted last its overwrite the
			 * the value at the third position*/
			testSet3.add(3);
			
			for (Integer inte : testSet3) {
				System.out.println(inte);
			}
			
			System.out.println("\n");
	}
}
