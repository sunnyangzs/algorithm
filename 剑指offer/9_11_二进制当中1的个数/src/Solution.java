/**
 * 
 * @author sunnyangzs
 * @date 2018年3月14日
 * @description:输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Solution {
	public int countOf1(int n){
		char[] array = String.valueOf(n).toCharArray();
		int count =0;
		for(int i=0;i<array.length;i++){
			if(array[i]=='1'){
				count++;
			}
		}
		return count;
		
	}
}
