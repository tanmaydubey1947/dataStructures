package linkedList;

public class RemoveElementRecursive {

    public static void main(String[] args) {

        ListNode node1 = new ListNode();
        node1.val = 1;

        ListNode node2 = new ListNode();
        node2.val = 72;
        node1.next = node2;

        ListNode node3 = new ListNode();
        node3.val = 3;
        node2.next = node3;

        removeElements(node1, 7);
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;

        head.next = removeElements(head.next, val);

        if (head.val == val) {
            return head.next;
        } else {
            return head;
        }
    }

    public static void helper(ListNode node, int val) {
        if (node == null) {
            return;
        }

        if (node.val != val) {
            helper(node.next, val);
        } else {
            if (node.next == null) {
                node = null;
                return;
            }
            node.val = node.next.val;
            node.next = node.next.next;
            helper(node, val);
        }
    }
}
