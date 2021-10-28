package letcode;

/**
 * @author dadaibiaoLi
 * @Desc 11. 盛最多水的容器
 * @Date 2021/10/28 20:32
 */
public class MaxArea {
    /**
     * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
     *
     * 说明：你不能倾斜容器。
     *
     * 来源：力扣（LeetCode）
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */


    public static void main(String[] args) {

    }

    public static int maxArea(int[] hight){
        //由题很容易看出是左右两边确定面积
        //模式识别:需要移动左右两边的一般选用双指针
        //如何移动指针：
        //相同情况，距离越远越好
        //区域受限于较短边   area = Math.min(hight[L],hight[R])*(R-L)
        //开始代码编写
        int area = 0;
        int L = 0;//左指针
        int R = hight.length-1;//右指针
        //条件是L<R
        while (L<R){
            area = Math.max(area,Math.min(hight[L],hight[R])*(R-L));
            if (hight[L]<hight[R]){
                L++;
            }else {
                R--;
            }
        }
        return area;
    }
}
