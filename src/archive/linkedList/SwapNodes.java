package archive.linkedList;

public class SwapNodes {

    /**
     * Leetcode Link : <a href="https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/">...</a>
     *
     * <p>
     *     Iteration for better approach : 1
     * </p>
     * <p>
     *     First find the total number of elements in the LinkedList and then simply calculate the last index of the LinkedList to which we have to replace the
     *     kth index.
     * </p>
     *
     * <p>
     *     Time Complexity : O(n)
     * </p>
     */

    public static void main(String[] args) {

        ListNode node1 = new ListNode();
        node1.val = 1;

        ListNode node2 = new ListNode();
        node2.val = 2;
        node1.next = node2;

        ListNode node3 = new ListNode();
        node3.val = 3;
        node2.next = node3;

        ListNode node4 = new ListNode();
        node4.val = 4;
        node3.next = node4;

        ListNode node5 = new ListNode();
        node5.val = 5;
        node4.next = node5;

        ListNode headNode = swapNodes(node1, 1);
    }

    public static ListNode swapNodes(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        int numOfNodes = 1;

        ListNode tempNode = head;

        while (tempNode.next != null) {
            numOfNodes++;
            tempNode = tempNode.next;
        }

        int lastIndex = numOfNodes - k + 1;
        tempNode = head;

        ListNode node1 = null, node2;

        while (k != 1) {
            k--;
            tempNode = tempNode.next;
        }
        node1 = tempNode;

        tempNode = head;

        while (lastIndex != 1) {
            lastIndex--;
            tempNode = tempNode.next;
        }
        node2 = tempNode;

        int tempVal = node1.val;
        node1.val = node2.val;
        node2.val = tempVal;


        return head;


    }
}
