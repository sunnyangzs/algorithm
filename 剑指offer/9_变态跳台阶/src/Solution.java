/**
 * 
 * @author sunnyangzs
 * @date 2018年3月14日
 * @description:一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Solution {
	public int JumpFloor2(int n){
		if(n<=0){
			return -1;
		}
		
		if(n==1){
			return 1;
		}else if(n==2){
			return 2;
		}else{
			return 2*JumpFloor2(n-1);
		}
	}
}
