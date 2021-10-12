package letcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author dadaibiaoLi
 * @Desc
 * @Date 2021/9/28 20:22
 */
public class test {
    public static void main(String[] args) {
//        int nums[] ={2,7,11,15};
//        int res[] = twoSum(nums,9);
//        for (int i = 0; i < res.length; i++) {
//            System.out.println(res[i]);
//        }


        int myarr[] = {1, 2, 3, 4, 5};
        List myList = Arrays.asList(myarr);
        System.out.println(myList.size());

        Integer myarra[] = {123, 45, 77, 8};
        List list = Arrays.stream(myarra).collect(Collectors.toList());
        //基本类型也可以实现转换（依赖boxed的装箱操作）
        int myarrb[] = {1, 2, 3, 4, 5};
        List list1 = Arrays.stream(myarrb).boxed().collect(Collectors.toList());
        String a = "222";
        String b = "333";
        a.equals(b);

        String[] s = new String[]{
                "dog", "lazy", "a", "over", "jumps", "fox", "brown", "quick", "A"
        };
        List<String> list2 = Arrays.asList(s);
        Collections.reverse(list);
        s = list2.toArray(new String[0]);//没有指定类型的话会报错
    }

    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] res = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                res[1] = i;
                res[0] = map.get(temp);
            }
            map.put(nums[i], i);
        }
        return res;
        //        int len = nums.length;
//        int[] res = new int[2];
//
//        for (int i = 0;i<len;i++){
//            for (int j = len-1;j>i;j--){
//                if (nums[i]+nums[j]==target){
//                    res[0]=nums[i];
//                    res[1]=nums[j];
//                    return res;
//                }
//            }
//        }
//return null;

//        for (int i = 0;i<len;i++){
//            for (int j = i;j<len-i;j++){
//                if(nums[i]+nums[j] == target){
//                    res[0] = nums[i];
//                    res[1] = nums[j];
//                    return res;
//                }
//            }
//        }
//        return null;
    }
}
