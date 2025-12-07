package archive.linkedList;

public class FlattenDoublyLinkedList {

    public static void main(String[] args) {

        Node node11 = new Node();
        node11.val = 11;
        node11.prev = null;
        node11.child = null;

        Node node12 = new Node();
        node12.val = 12;
        node12.prev = node11;
        node12.next = null;
        node11.next = node12;

        Node node7 = new Node();
        node7.val = 7;
        node7.prev = null;
        node7.child = null;

        Node node8 = new Node();
        node8.val = 8;
        node8.prev = node7;
        node8.child = node11;
        node7.next = node8;

        Node node9 = new Node();
        node9.val = 9;
        node9.prev = node8;
        node9.child = null;
        node8.next = node9;

        Node node10 = new Node();
        node10.val = 10;
        node10.prev = node9;
        node10.child = null;
        node10.next = null;
        node9.next = node10;

        Node node1 = new Node();
        node1.val = 1;
        node1.prev = null;
        node1.child = null;

        Node node2 = new Node();
        node2.val = 2;
        node2.prev = node1;
        node2.child = null;
        node1.next = node2;

        Node node3 = new Node();
        node3.val = 3;
        node3.prev = node2;
        node3.child = node7;
        node2.next = node3;

        Node node4 = new Node();
        node4.val = 4;
        node4.prev = node3;
        node4.child = null;
        node3.next = node4;

        Node node5 = new Node();
        node5.val = 5;
        node5.prev = node4;
        node5.child = null;
        node4.next = node5;

        Node node6 = new Node();
        node6.val = 6;
        node6.prev = node5;
        node6.child = null;
        node5.next = node6;
        node6.next = null;

        flatten(node1);

    }

    public static Node flatten(Node head) {
        System.out.println(head);
        return null;
    }


    private void flattenNodes(Node head){

        while(head.child == null && head.next != null){
            head = head.next;
        }

        flatten(head);

    }
}
