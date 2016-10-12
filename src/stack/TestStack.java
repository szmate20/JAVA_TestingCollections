package stack;

import java.util.Stack;

class TestStack {
	/*The stack is maintain 
	 * the order of the insertion 
	 * and the values can be reached by only a 
	 * specific way, the stack is not indexed.*/
	
	public static void main(String[] args) {
		//The stack maintain the last in first out model(LIFO).
		//Stack is synchronized the non synchronized version is the ArrayDeque.
		Stack<String> testStack = new Stack<>();
		
		//The stack allow null value.
		testStack.push(null);
		testStack.push("Second");
		testStack.push("Third"); //First to pop
		
		//Since its implement collection its implement iterable too.
		for (String string : testStack) {
			System.out.println(string);
		}
		
		System.out.println();
		System.out.println(testStack.pop());
		System.out.println(testStack.pop());
		System.out.println(testStack.pop());
	}
}
