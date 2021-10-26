package letcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dadaibiaoLi
 * @Desc  ZigZag Conversion 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 * @Date 2021/10/26 19:31
 */
public class Convert {

    public static void main(String[] args) {
        convert("01234567890",3);
    }

    public static String convert(String s, int numRows){
        //如果说 s为空 或者numrows小于2则无需变化
        if (s==null|| s.length() == 0|| numRows==1){
            return s;
        }
        //创建 numRows大小的数组
        StringBuilder[] array = new StringBuilder[numRows];
        //都需要实例一下
        for (int i = 0; i < numRows; i++) {
            array[i] = new StringBuilder();
        }
        //现在开始存放 ，
        int dir = 1; //方向标识 如果是从0开始则一直加1  如果从 nums开始一直-1
        int index = 0;
        //开始存放
        for (char c : s.toCharArray()) {
            array[index].append(c);
            index +=dir;
            if (index == 0 || index == numRows-1) dir = -dir;
        }
        //开始拼接
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            res.append(array[i]);
        }
        return res.toString();
    }
}
