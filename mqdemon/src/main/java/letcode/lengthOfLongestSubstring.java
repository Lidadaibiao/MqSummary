package letcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dadaibiaoLi
 * @Desc  给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度
 * @Date 2021/10/9 8:51
 */
public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(Math.max(3, 3));
        System.out.println(function("abfabcdefg"));
    }
    public static  int function(String s){
//        //先记录上一次字符出现的位置，搞一个数组记录
//        int[] last = new int[128];
//        for (int i = 0; i < 128; i++) {
//            last[i] = -1;
//        }
//        // 字符长度
//            int n = s.length();
//        int res = 0;
//        int start = 0; //开始的位置
//        for (int i = 0; i < n; i++) {
//            int index = s.charAt(i);
//            start = Math.max(start,last[index]+1);
//            res = Math.max(res,i-start+1);
//            last[index] = i;
//        }
//        return res;
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }
}
