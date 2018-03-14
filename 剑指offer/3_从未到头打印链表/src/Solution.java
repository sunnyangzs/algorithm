import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 
 * @author sunnyangzs
 * @date 2018年3月14日
 * @version v1.0
 * @description:输入一个链表，从尾到头打印链表每个节点的值。
 */

class ListNode{
	int val;
	ListNode next=null;
	
	public ListNode(int val) {

		this.val = val;
	}
}

public class Solution {
	public String printReverseList(ListNode listNode){
		List<Integer> list = new ArrayList<>();
		
		if (listNode==null) {
			return null;
		}
		
		Stack<ListNode> stack = new Stack<>();
		ListNode temp = listNode;
		
		stack.add(listNode);
		while(!stack.isEmpty()){
			temp=stack.pop();
			list.add(temp.val);
			temp=temp.next;
			stack.push(temp);
		}
		
		return list.toString();
	}
}
