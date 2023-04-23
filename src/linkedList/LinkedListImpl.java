package linkedList;

public class LinkedListImpl {
	
	
	public static void main(String[] args) {
		
		int numOfLinkedLists = 5;
		
		NodeGeneric<Integer> head = new NodeGeneric<>(5);
		NodeGeneric<Integer> temp = head;
	
		
		for(int i = 1;i<numOfLinkedLists;i++) {
			
			NodeGeneric<Integer> node = createNodes(i*10);
			temp.next = node;
			temp = node;
			
		}
		
		printNodes(head);
		
	}
	
	
	
	public static NodeGeneric<Integer> createNodes(int data) {
		NodeGeneric<Integer> node = new NodeGeneric<>(data);
		return node;
	}
	
	
	public static void printNodes(NodeGeneric<Integer> head) {
		NodeGeneric<Integer> temp = head;
		while (temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

}
