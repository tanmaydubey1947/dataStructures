package linkedList;

public class MergeInBetween {

    public static void main(String[] args) {


        ListNode node0 = new ListNode();
        node0.val = 0;

        ListNode node1 = new ListNode();
        node1.val = 1;
        node0.next = node1;

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


        ListNode node6 = new ListNode();
        node6.val = 1000001;

        ListNode node7 = new ListNode();
        node7.val = 1000002;
        node6.next = node7;

        ListNode node8 = new ListNode();
        node8.val = 1000003;
        node7.next = node8;

        ListNode result = mergeInBetween(node0, 3, 4, node6);

    }

    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode resultHead = list1;

        int bwNodes = b - a + 1;

        a--;
        while (a != 0) {
            list1 = list1.next;
            a--;
        }

        ListNode mList1 = list1;

        while (bwNodes != 0) {
            mList1 = mList1.next;
            bwNodes--;
        }
        mList1 = mList1.next;

        list1.next = list2;

        while(list2.next!=null){
            list2 = list2. next;
        }

        list2.next = mList1;

        return resultHead;
    }


}
