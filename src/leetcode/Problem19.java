package leetcode;

/**
 * <p>
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * 给定的 n 保证是有效的。
 * 进阶：
 * 你能尝试使用一趟扫描实现吗？
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
 * </p>
 *
 * @author wangzefeng
 */
public class Problem19 {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode node = head;
        for (int i = 2; i <= 5; i++) {
            node.next = new ListNode(i);
            node = node.next;
        }
        node.next = null;

        ListNode l = removeNthFromEnd(head, 2);

        while (l != null) {
            System.out.println(l.val);
            l = l.next;
        }
    }

    private static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode preHead = new ListNode(-1);
        preHead.next = head;

        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        temp = preHead;
        int delPos = length - n;
        while (delPos > 0) {
            delPos--;
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return preHead.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
