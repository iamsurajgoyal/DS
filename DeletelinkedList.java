package code;

public class DeletelinkedList {
	
	Node head;
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
	 void delete(int position)
	{
		if(head ==null)
		return;
		
		Node curr = head;
		
		if(position == 0)
		{
			head = curr.next;
			return;
		}
		
		for (int i=0; curr!=null && i<position-1; i++) 
            curr = curr.next;
		
		Node next = curr.next.next;
		curr.next = next;
		
	}
	
	public void printList()
	{
		Node head = null;
		Node curr = head;
		while(curr!=null)
		{
			System.out.println(curr.data+" ");
			curr = curr.next;
		}
	}
	
	public static void main(String[] args) 
    { 
        /* Start with the empty list */
        LinkedList llist = new LinkedList(); 
  
        llist.push(7); 
        llist.push(1); 
        llist.push(3); 
        llist.push(2); 
        llist.push(8); 
  
        System.out.println("\nCreated Linked list is: "); 
        llist.printList(); 
  
        llist.delete(4);  // Delete node at position 4 
  
        System.out.println("\nLinked List after Deletion at position 4: "); 
        llist.printList(); 
    }

}
