import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

/**
 * 
 * @author sunnyangzs
 * @date 2018年3月14日
 * @version v1.0
 * @description:用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */

public class Solution {
	
	int val =0;
	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();
	
	public void push(int num){
		 stack1.push(num);
	}
	
	public int pop(){
//		val = stack1.pop();
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
		val = stack2.pop();
		while(!stack2.isEmpty()){
			stack1.push(stack2.pop());
		}
		return val;
	}

}
