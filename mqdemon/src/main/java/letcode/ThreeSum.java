package letcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author dadaibiaoLi
 * @Desc 15. 三数之和
 * @Date 2021/11/16 19:37
 */
public class ThreeSum {


    public static void main(String[] args) {
        int[] a = {-1,0,1,2,-1,-4};
        System.out.println(ThreeSum.threeSum(a));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        System.out.println("1111111111111111111111111111111");
        //先排序 从小到大   nums[i]取第一个  双指针 L  R
        List<List<Integer>> res = new ArrayList<>();
        //情况 排除
        if (nums==null||nums.length<3)return res; //null 数组长度小于3 直接抛出
        int len = nums.length;
        //排序
        Arrays.sort(nums);
        //循环 双指针开始找
        for (int i = 0; i < len; i++) {
            //默认取第一个
            if (nums[i]>0)break;//从小到大排序，最小的大于0    三数之和肯定大于0  直接退出循环
            if (i>0 && nums[i]==nums[i-1]) continue;//去重，如果重复的则继续
            int L = i+1;
            int R = nums.length-1;
            while (L<R){
                System.out.println("1111111111111111111111111111111");
                //取和
                int sum = nums[i] + nums[L] +nums[R];
                //小于0 L++
                if (sum<0)L++;
                //大于0 R--
                if (sum>0)R--;
                //等于0
                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R && nums[L] == nums[L+1]) L++; // 去重
                    while (L<R && nums[R] == nums[R-1]) R--; // 去重
                    L++;
                    R--;
                }

            }
        }
        return res;
    }
}
