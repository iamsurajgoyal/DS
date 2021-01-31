package code;

import code.LinkedList.Node;

class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int x) {
			data = x;
			next = null;
		}
	}

	public void push(int temp) {

		Node new_node = new Node(temp);

		new_node.next = head;

		head = new_node;
	}

	public void insertAfter(Node prev_node, int temp) {

		if (prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}

		Node new_node = new Node(temp);

		new_node.next = prev_node.next;

		prev_node.next = new_node;
	}

	public void append(int temp) {

		Node new_node = new Node(temp);

		if (head == null) {
			head = new Node(temp);
			return;
		}

		new_node.next = null;

		Node last = head;
		while (last.next != null)
			last = last.next;

		last.next = new_node;
		return;
	}

	public void printList() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

	public static void main(String[] args) {

		LinkedList llist = new LinkedList();

		llist.append(6);

		llist.push(7);

		llist.push(1);

		llist.append(4);

		llist.insertAfter(llist.head.next, 8);

		System.out.println("\nCreated Linked list is: ");
		llist.printList();
	}
}
