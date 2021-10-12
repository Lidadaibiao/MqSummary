package letcode;

/**
 * @author dadaibiaoLi
 * @Desc  88.合并两个有序数组
 * @Date 2021/10/12 17:10
 */
public class Merge {
    public static void main(String[] args) {

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        //正向双指针
        int p1 = 0;  //指向 nums1 的指针
        int p2 = 0;  // 指向 nums2 的指针
        int[] sort = new int[m+n];
        int cur;
        while (p1<m||p2<n){
            if (p1 == m){
                cur = nums1[p2++];
            }else if (p2 == n){
                cur = nums1[p1++];
            }else if (nums1[p1]<nums2[p2]){
                cur = nums1[p1++];
            }else {
                cur = nums2[p2++];
            }
            sort[p1+p2-1] = cur;
        }
        for (int i = 0;i<m+n;i++){
            nums1[i] = sort[i];
        }
    }
}
