package linkedList;

import java.util.Scanner;

public class LinkedListIOperations {

	public static Node<Integer> createNodes(){
		
		Node<Integer> head = null;
		Node<Integer> tail = null;
		
		Scanner s = new Scanner(System.in);
		
		int data = s.nextInt();
		
		while(data != -1) {
			
			Node<Integer> newNode = new Node<Integer>(data);
			
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
	
	public static void printNodes(Node<Integer> head) {
		Node<Integer>  temp = head;
		
		while(temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
	public static Node<Integer> insertAtPos(Node<Integer> head, int pos, int data) {
		
		Node<Integer> temp = head;
		Node<Integer> newNode = new Node<Integer>(data); 
		
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
	
	public static Node<Integer> deleteANode(Node<Integer> head, int pos){
		
		if(pos == 0) {
			head = head.next;
			return head;
			
		}
		else {
			Node<Integer> tempBehind = head;
			Node<Integer> tempForward = head.next;
			
			for (int i = 1; i <= pos - 1; i++) {
				tempBehind = tempBehind.next;
				tempForward = tempForward.next;
			}
			tempBehind.next = tempForward.next;
			return head;
		}
		
	}
	
	public static Node<Integer> midPoint(Node<Integer> head){
		
		Node<Integer> fast = head;
		Node<Integer> slow = head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head = createNodes();

		//head = insertAtPos(head, 0, 5);

		//printNodes(head);

		//head = deleteANode(head, 4);
		
		//printNodes(head);
		
		System.out.println(midPoint(head).data);

	}
}
