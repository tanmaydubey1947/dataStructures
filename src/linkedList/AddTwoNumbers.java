package linkedList;

public class AddTwoNumbers {

    public static void main(String[] args) {

        ListNode node0 = new ListNode();
        node0.val = 2;

        ListNode node1 = new ListNode();
        node1.val = 4;
        node0.next = node1;

        ListNode node2 = new ListNode();
        node2.val = 3;
        node1.next = node2;

        ListNode node3 = new ListNode();
        node3.val = 5;

        ListNode node4 = new ListNode();
        node4.val = 6;
        node3.next = node4;

        ListNode node5 = new ListNode();
        node5.val = 4;
        node4.next = node5;

        ListNode node = addTwoNumbers(node0, node3);
        System.out.println(node);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        while(l1.next != null){
            str1.append(l1.val);
            l1 = l1.next;
        } str1.append(l1.val);

        while(l2.next != null){
            str2.append(l2.val);
            l2 = l2.next;
        } str2.append(l2.val);

        str1.reverse(); str2.reverse();

        long num = Long.parseLong(str1.toString()) + Long.parseLong(str2.toString());

        StringBuilder stringBuilder = new StringBuilder(String.valueOf(num));

        String[] str3 = stringBuilder.reverse().toString().split("");

        ListNode tempNode = result;

        for(String str : str3){
            ListNode node = new ListNode();
            node.val = Integer.parseInt(str);
            tempNode.next = node;
            tempNode = node;
        }

        return result.next;
    }
}
