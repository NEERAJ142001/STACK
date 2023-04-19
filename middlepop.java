import java.util.* ;
import java.io.*; 
public class Solution {
	public static void solve(Stack<Integer> inputStack, int N,int count)
	{
		if(count==(N-1)/2)
		{
			inputStack.pop();
			return;
		}
		int num=inputStack.peek();
		inputStack.pop();

		solve(inputStack,N,count+1);

		inputStack.push(num);

	}
	public static void deleteMiddle(Stack<Integer> inputStack, int N) {
		int count=0;
		solve(inputStack,N,count);
	}
}
