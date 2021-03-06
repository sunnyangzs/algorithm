import java.util.Stack;
import java.util.Iterator;
 
/**
 * 
 * @author sunnyangzs
 * @date 2018年3月14日
 * @description:定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class Solution {
 
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int node) {
        stack.push(node);
    }
 
    public void pop() {
        stack.pop();
    }
 
    public int top() {
        return stack.peek();
    }
 
    public int min() {
        int min = stack.peek();
        int tmp = 0;
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()){
            tmp = iterator.next();
            if (min>tmp){
                min = tmp;
            }
        }
        return min;
    }
}