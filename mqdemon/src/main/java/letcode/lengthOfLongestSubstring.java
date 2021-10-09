package letcode;

/**
 * @author dadaibiaoLi
 * @Desc  给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度
 * @Date 2021/10/9 8:51
 */
public class lengthOfLongestSubstring {
    public static void main(String[] args) {

    }
    public static  int function(String s){
        //转换成字符数组
        char[] chars = s.toCharArray();
        //标识 指针下标位置
        int start = 0;
        while (start>chars.length){
            if (chars[start] !=chars[start+1]){
                start++;
            }
        }
        return  0;
    }
}
