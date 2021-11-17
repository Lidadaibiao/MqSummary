package letcode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author dadaibiaoLi
 * @Desc  20. 有效的括号
 * @Date 2021/11/16 20:38
 */
public class IsValid {

    public static void main(String[] args) {
        String s = "{[]}()";
        IsValid.isValid(s);
    }
    public static boolean isValid(String s) {
        //有效的扣号。先进去的括号 后匹配  s 为奇数 直接false
        int n = s.length();
        if (n%2 == 1){
            return false;
        }
        //利用map集合  进行k v判断
        Map<Character,Character> paris = new HashMap<Character,Character>(){{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        //创造一个栈
        Deque<Character> stack = new LinkedList<>();
        //循环字符串
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            //如果栈里面没有 就放在栈里面
            if (paris.containsKey(ch)) {
                //如果栈里面已经有就要判断 取出来的这一个是否为该对应v值
                if (stack.isEmpty() || !stack.peek().equals(paris.get(ch)) ) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
