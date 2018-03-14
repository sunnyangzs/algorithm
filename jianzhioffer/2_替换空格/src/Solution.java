import java.awt.event.MouseWheelEvent;

/**
 * 
 * @author sunnyangzs
 * @date 2018年3月14日
 * @version v1.0
 * @description:请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Solution {
	public String replaceString(String str){
		
		StringBuilder stringBuilder = new StringBuilder();
		if(str==null){
			return null;
		}
		
		for(int i =0;i<str.length();i++){
			if(str.charAt(i)==' '){
				stringBuilder.append('%');
				stringBuilder.append('2');
				stringBuilder.append('0');
				
			}else{
				stringBuilder.append(str.charAt(i));
			}
		}
		
		return stringBuilder.toString();
	}
}
