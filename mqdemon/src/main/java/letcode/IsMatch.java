package letcode;

/**
 * @author dadaibiaoLi
 * @Desc
 * 10. 正则表达式匹配
 * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 *
 * '.' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * 所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。
 * @Date 2021/10/28 19:58
 */
public class IsMatch {

    //.匹配任意单个字符，匹配零个或多个前面的那一个元素
    public static void main(String[] args) {

    }
    public static boolean  isMatch(String s,String p){
     //dp[i][j]---->?true||false    s--前i个  p---前j 个是否能匹配
        //===》dp[i-1][j-1] = true 只需要 s[i] == p[j]
        //1 s[i] == p[j]
        //2 p[j] = .
        //3*  p[j] = *
        //  --------p[j] = * 不能判断s[i]直接等于p[j]   *是匹配前面的p[j-1] 0个或者多个
        //  有两种情况 p[j-1] != s[i] ===》
        //-----------1:



        return true;
    }
}
