import java.util.Currency;

/**
 * 
 * @author sunnyangzs
 * @date 2018年3月14日
 * @description:给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Solution {

	public int pow(int target,int n)throws Exception{
		
		int exponent=0;
		int res=1,cur=target;
		
		if(n>0){
			exponent=n;
		}else if(n<0){
			if(target<0)
				throw new Exception("出错");
			exponent=-n;
		}else{
			return 1;
		}
		
		while(exponent!=0){
			if((exponent&1)==1){
				res*=cur;
			}
			cur*=cur;
			exponent>>=1;
		}
		
		return 0;
	}
}
