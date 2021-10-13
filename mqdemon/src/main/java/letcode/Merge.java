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
//        int p1 = 0;  //指向 nums1 的指针
//        int p2 = 0;  // 指向 nums2 的指针
//        int[] sort = new int[m+n];
//        int cur;
//        while (p1<m||p2<n){
//            if (p1 == m){
//                cur = nums1[p2++];
//            }else if (p2 == n){
//                cur = nums1[p1++];
//            }else if (nums1[p1]<nums2[p2]){
//                cur = nums1[p1++];
//            }else {
//                cur = nums2[p2++];
//            }
//            sort[p1+p2-1] = cur;
//        }
//        for (int i = 0;i<m+n;i++){
//            nums1[i] = sort[i];
//        }
        //逆向双指针
        //从后面开始遍历 对比 将最大的放入最后的位置
        int p1 = m-1,p2= n-1;
        //最后一个待插入的位置下标
        int tail = m+n-1;
        //待插入数据的承载值
        int cur;
        //两个都小于0的时候 证明 都搜索完毕了
        while (p1>=0||p2>=0){
            if (p1 == -1){
                cur = nums2[p2--];
            }else if (p2 == -1){
                cur  = nums1[p1--];
            }else if (nums1[p1]>nums2[p2]){
                cur = nums1[p1--];
            }else {
                cur = nums2[p2--];
            }
            nums1[tail--] = cur;
        }
    }
}
