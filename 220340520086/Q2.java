class Q2
{
	Node head;
	
	class Node
	{
		int data;
		Node next;
	
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	static void ReverseList(ReverseList head)
	{
		Q2 next=null;
		Q2 current = head;
		Q2 previous = null;
		
		while(current != null)
		{
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		ReverseList = previous;
		return ReverseList;
	}
	
	
	public static void main(String args[])
	{
		Q2 l1 = new Q2();
		list.head = new Node(1);
		list.head.next = new Node(5);
		list.head.next.next = new Node(1);
		list.head.next.next.next = new Node(2);
		list.head.next.next.next.next  = new Node(3);
		list.head.next.next.next.next.next = new Node(4);
		list.head.next.next.next.next.next.next = new Node(5);
		
		
		System.out.println("Test case 1 is");
		list.printList(head);
		head = list.reverse(head);
		
		System.out.println("Reversed Test case 1 is");
		
		
	}
}