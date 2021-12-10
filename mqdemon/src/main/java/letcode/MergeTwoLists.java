package letcode;

/**
 * @author dadaibiaoLi
 * @Desc 21. 合并两个有序链表
 *
 *
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * @Date 2021/12/7 20:34
 */
public class MergeTwoLists {

    public static void main(String[] args) {

        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        int i = 0;
        while (i <= 4) {
            l1.val = i + 1;
            l2.val = i + 2;
            l1 = l1.next;
            l2 = l2.next;
            i++;
        }
        mergeTwoLists(l1,l2);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        //创建一个新的ListNode
        ListNode newListNode = new ListNode();
        //得到第一个链表的首值
        //两个都是升序。。。
        while (list2 !=null && list1 !=null){
            int pre1 = list1.val;
            //list1 最小值判断
            if (pre1>list2.val){
                //list2 向后移动
                newListNode.val = list2.val;
                newListNode = newListNode.next;
                list2 = list2.next;

            }else {
                newListNode.val = list1.val;
                newListNode = newListNode.next;
                list1 = list1.next;
            }
        }
        //判断谁不是null
        while (list1.next !=null){
            newListNode.val = list1.val;
            newListNode = newListNode.next;
            list1 = list1.next;
        }
        while (list2.next !=null){
            newListNode.val = list2.val;
            newListNode = newListNode.next;
            list2 = list2.next;
        }
        return newListNode;
    }
}
