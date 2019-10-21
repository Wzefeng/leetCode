package leetcode;

/**
 * <p>
 * 给定一个链表，判断链表中是否有环。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 如果 pos 是 -1，则在该链表中没有环。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/linked-list-cycle
 *
 * @author wangzefeng
 */
public class Problem141 {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode pos = head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = pos;

        System.out.println(hasCycle(head));
    }

    private static boolean hasCycle(ListNode head) {
        // 快慢指针，还可以用哈希表做
        ListNode fast = head;
        ListNode low = head;

        while (fast != null && fast.next != null) {
            low = low.next;
            fast = fast.next.next;
            if (low == fast) {
                return true;
            }
        }

        return false;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
