class Node 
{
	int data;
	Node next;
}

class LinkedList
{
	static Node current = null;
	static Node previous = null;
	static Node first = null;  
	
	public static void insert(int data)
	{
		Node temp=new Node();
		temp.data=data;
		temp.next=null;
		
		//Insert when there is nothing
		if( first == null)
		{
			first = temp;
			return;
			
		}
		else
		{
			current = first;
			while(current != null && current.data < temp.data)
			{
				previous = current;
				current = current.next;
			}
		}
		
		// Insert First
		if(current == null && previous == null && first != null)
		{
			//System.out.println("IF");
			temp.next = first;
			first = temp;
			return;
		}
		//Insert Last
		if(current == null && previous != null)
		{
			//System.out.println("IL");
			previous.next = temp;
			return;
		}
		//Insert Middle
		if(previous != null && current != null)
		{
			//System.out.println("IM");
			previous.next = temp;
			temp.next = current;
			return;
		}
		if(current != null && previous == null)
		{
			//System.out.println("IF-2");
			temp.next = current;
			first = temp;	
		}
		
	}
	public static void remove(int data)
	{
		System.out.println(" "+data + " Is removed Succesfull");
		current = first;
		previous = null;
		
		// traverse until you find data in the list
		while(current != null && current.data != data)
		{
			previous = current;
			current = current.next;
		}
			
		// condition #1
		if(previous  == null && current == null)
		{
			System.out.println("No nodes in the list");
			return;
		}
		
		// condition #2
		// we went until the end and couldn't find data
		if(previous != null && current == null)
		{
			System.out.println("Data not found in the list");
			return;
		}
		
		// Node to be deleted is the first node
		// condition #3
		if(previous == null && current != null)
		{
			first = current.next;
			current.next = null;
			current = null;
			return;
		}
		
		// Node to be deleted is in the middle or last
		// condition #4
		if(previous != null && current != null)
		{
			previous.next = current.next;
			current.next = null;
			current = null;
		}
	}
	
	public static void display()
	{
		Node traverse = first;
		
		while(traverse != null)
		{
			System.out.print(traverse.data + " -> ");
			traverse = traverse.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args)
	{
		LinkedList.insert(1);
		LinkedList.insert(0);
		LinkedList.insert(3);
		LinkedList.insert(4);
		LinkedList.insert(2);
		
		LinkedList.display();
		
		LinkedList.remove(2);
		
		
		LinkedList.display();
	}
}

