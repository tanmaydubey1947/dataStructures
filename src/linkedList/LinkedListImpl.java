package linkedList;

public class LinkedListImpl {
	
	
	public static void main(String[] args) {
		
		int numOfLinkedLists = 5;
		
		Node<Integer> head = new Node<>(5);
		Node<Integer> temp = head;
	
		
		for(int i = 1;i<numOfLinkedLists;i++) {
			
			Node<Integer> node = createNodes(i*10);
			temp.next = node;
			temp = node;
			
		}
		
		printNodes(head);
		
	}
	
	
	
	public static Node<Integer> createNodes(int data) {
		Node<Integer> node = new Node<>(data);
		return node;
	}
	
	
	public static void printNodes(Node<Integer> head) {
		Node<Integer> temp = head;
		while (temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

}
