package com.sunnyangzs;
/**
 * 
 * @author sunnyangzs
 * @date 2018年3月14日
 * @version v1.0
 * @description 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */

class TreeNode{
	int val;
	TreeNode left = null;
	TreeNode right = null;
	
	public TreeNode(int val) {
		// TODO Auto-generated constructor stub
		this.val = val;
	}
	
	
}
public class Solution2 {
	
	public TreeNode reConstructBinaryTree(int[] pre,int[] in){
		TreeNode treeNode = this.reContructBinaryTree(pre, 0, pre.length, in, 0, in.length);
				
		return treeNode;
	}
	
	private  TreeNode reContructBinaryTree(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn){
		
		if(startPre>endPre || startIn > endIn){
			return null;
		}
		
		TreeNode root = new TreeNode(pre[startPre]);
		for(int i = startIn;i<endIn;i++){
			if(in[i]==pre[startPre]){
				root.left =reContructBinaryTree(pre, i, startPre+i-startIn, in, 0, i-1);
				root.right = reContructBinaryTree(pre, startPre+i-startIn+1, endPre, in, i+1, endIn);
			}
		}
		
		return null;
	}

}
