package leetcode;

/**
 * <p>
 * 反转一个单链表。
 * 示例:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list
 * </p>
 *
 * @author wangzefeng
 * @since JDK1.8
 */
public class Problem206 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node = head;
        for (int i = 2; i <= 5; i++) {
            node.next = new ListNode(i);
            node = node.next;
        }
        node.next = null;

        ListNode newHead = reverseList(head);

        for (ListNode ln = newHead; ln != null; ln = ln.next) {
            System.out.println(ln.val);
        }
    }

    private static ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

