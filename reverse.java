import java.util.Stack;

public class Solution {

	public static void insertAtBottom(int num,Stack<Integer> stack)
	{
		if(stack.isEmpty())
		{
			stack.push(num);
			return;
		}
		int numm=stack.peek();
		stack.pop();

		insertAtBottom(num, stack);
		stack.push(numm);
	}
    
	public static void reverseStack(Stack<Integer> stack) {
		if(stack.isEmpty())
		return;

		int num=stack.peek();
		stack.pop();

		reverseStack(stack);

		insertAtBottom(num,stack);


		
	}

}
