/**
 * 
 * @author sunnyangzs
 * @date 2018年3月14日
 * @description:大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
	n<=39
 */
public class Solution {

	public int Fibonacci(int n){
		int a =1,b=1,c=0;
		
		if (n<=0){
			return 0;
		}
		int i=3;
		if((n==1)||(n==2)){
			return 1;
		}else{
			while(i<=n){
				c = a+b;
				a=b;
				b =c;
			}
		}

		return c;
	}
}
