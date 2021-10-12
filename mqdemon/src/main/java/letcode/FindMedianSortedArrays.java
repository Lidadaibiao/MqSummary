package letcode;

import java.util.Arrays;

/**
 * @author dadaibiaoLi
 * @Desc
 * @Date 2021/10/11 19:46
 */
public class FindMedianSortedArrays {

    public static void main(String[] args) {
        int nums1[] = new int[]{1, 2};
        int nums2[] = new int[]{3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //两数组长度之和，然后排序
        int[] sumnum = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            sumnum[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            sumnum[nums1.length + i] = nums2[i];
        }
        //给合并后的数组进行排序
        Arrays.sort(sumnum);
        if (sumnum.length % 2 == 0) {
            int mid = sumnum.length / 2;
            return (double) (sumnum[mid - 1] + sumnum[mid]) / 2;
        }
        return (double) sumnum[sumnum.length / 2 - 1];
    }
}
