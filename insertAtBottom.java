import java.util.* ;
import java.io.*; 
public class Solution 
{
  public static void solve(Stack <Integer> myStack, int x)
  {
    if(myStack.isEmpty())
    {
      myStack.push(x);
    return;
    }
   int num=myStack.peek();
    myStack.pop();

    solve(myStack, x);

    myStack.push(num);
  }
  public static Stack<Integer> pushAtBottom(Stack <Integer> myStack, int x) 
  {
   solve(myStack,x);
   return myStack;
}
}
