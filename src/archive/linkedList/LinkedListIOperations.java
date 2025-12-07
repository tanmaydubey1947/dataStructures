package archive.linkedList;

import java.util.Scanner;

public class LinkedListIOperations {

	public static NodeGeneric<Integer> createNodes(){
		
		NodeGeneric<Integer> head = null;
		NodeGeneric<Integer> tail = null;
		
		Scanner s = new Scanner(System.in);
		
		int data = s.nextInt();
		
		while(data != -1) {
			
			NodeGeneric<Integer> newNode = new NodeGeneric<Integer>(data);
			
			if(head == null) {
				head = newNode;
				tail = newNode;
			} else {
				
				tail.next = newNode;
				tail = newNode;
				
			}
			data = s.nextInt();
		}
		s.close();
		return head;
	}
	
	public static void printNodes(NodeGeneric<Integer> head) {
		NodeGeneric<Integer> temp = head;
		
		while(temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
	public static NodeGeneric<Integer> insertAtPos(NodeGeneric<Integer> head, int pos, int data) {
		
		NodeGeneric<Integer> temp = head;
		NodeGeneric<Integer> newNode = new NodeGeneric<Integer>(data);
		
		if(pos == 0) {
			newNode.next = head;
			head = newNode;
			return head;
		} else {
			for(int i = 1 ;i <pos-1;i++) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			return head;
		}
		
		
	}
	
	public static NodeGeneric<Integer> deleteANode(NodeGeneric<Integer> head, int pos){
		
		if(pos == 0) {
			head = head.next;
			return head;
			
		}
		else {
			NodeGeneric<Integer> tempBehind = head;
			NodeGeneric<Integer> tempForward = head.next;
			
			for (int i = 1; i <= pos - 1; i++) {
				tempBehind = tempBehind.next;
				tempForward = tempForward.next;
			}
			tempBehind.next = tempForward.next;
			return head;
		}
		
	}
	
	public static NodeGeneric<Integer> midPoint(NodeGeneric<Integer> head){
		
		NodeGeneric<Integer> fast = head;
		NodeGeneric<Integer> slow = head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
	
	public static void main(String[] args) {
		
		NodeGeneric<Integer> head = createNodes();

		//head = insertAtPos(head, 0, 5);

		//printNodes(head);

		//head = deleteANode(head, 4);
		
		//printNodes(head);
		
		System.out.println(midPoint(head).data);

	}
}
