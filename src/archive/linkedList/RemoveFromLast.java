package archive.linkedList;

public class RemoveFromLast {

    public static void main(String[] args) {

        ListNode node1 = new ListNode();
        node1.val = 1;

        ListNode node2 = new ListNode();
        node2.val = 2;
        node1.next = node2;

//        ListNode node3 = new ListNode();
//        node3.val = 3;
//        node2.next = node3;
//
//        ListNode node4 = new ListNode();
//        node4.val = 4;
//        node3.next = node4;
//
//        ListNode node5 = new ListNode();
//        node5.val = 5;
//        node4.next = node5;

        ListNode result = removeNthFromEnd(node1, 1);

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if(head==null || head.next == null){
            return null;
        }

        if(head.next.next == null){
            head = head.next;
            return head;
        }

        ListNode slowNode = head;
        ListNode fastNode = head;
        int temp = 0;

        while (fastNode.next != null && fastNode.next.next != null) {
            for (int i = 1; i < n; i++) {
                fastNode = fastNode.next;
            }
            slowNode = slowNode.next;
            temp++;
        }

        if(temp == 0){
            head = head.next;
            return  head;
        }

        if (fastNode.next != null) {
            slowNode = slowNode.next;
        }
        slowNode.val = slowNode.next.val;
        slowNode.next = slowNode.next.next;

        return head;
    }
}
