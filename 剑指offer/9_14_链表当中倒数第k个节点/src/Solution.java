import java.util.concurrent.CountDownLatch;

/**
 * 
 * @author sunnyangzs
 * @date 2018年3月14日
 * @description:输入一个链表，输出该链表中倒数第k个结点。
 */

class LinkNode{
	int val;
	LinkNode next =null;
	public LinkNode(int val) {
		// TODO Auto-generated constructor stub
		this.val = val;
	}
}
public class Solution {

	public LinkNode kTh(LinkNode linkNode,int k){
		if(linkNode==null){
			return null;
		}
		
		int count=0;
		LinkNode tmp = linkNode;
		while(tmp.next!=null){
			 count++;
			 tmp = tmp.next;
		}
		if(count<k){
			return null;
		}
		LinkNode node = linkNode;
		for(int i=0;i<count-k;i++){
			node = node.next;
		}
				
		return node;
	}
}
