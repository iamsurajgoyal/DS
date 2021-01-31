package code;
import code.LinkedList;
import code.LinkedList.Node;



public class Linked {
	static Node head;
	
	class Node
	{
		int data;
		Node next;
		Node(int x)
		{
			data = x;
			next = null;
		}
	}
	
	public void push(int tmp)
	{
		
		Node temp = new Node(tmp);
		temp.next = head;
		head = temp;
	}
	public void inserAfter(Node prev,int tmp)
	{
		if(prev==null)
		{
			System.out.println("Can't be null");
		}
		Node temp = new Node(tmp);
		temp.next = prev.next;
		prev.next = temp;
	}
	
	public void append(int tmp)
	{
		Node temp = new Node(tmp);
		if(head==null)
		{
			head = new Node(tmp);
			return;
		}
		temp.next=null;
		Node curr = head;
		while(curr!=null)
		{
			curr = curr.next;
		}
		curr.next = temp;
	}
	
	public void printList() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ls = new LinkedList();
		ls.append(6);

		ls.push(7);

		ls.push(1);

		ls.append(4);

		ls.insertAfter(ls.head.next, 8);
		
		System.out.println("\nCreated Linked list is: ");
		ls.printList();

	}

}
