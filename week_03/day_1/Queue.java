class Node
{
	int data;
	Node next;
}

class Queue
{
	static Node first = null;
	
	public static void queue(int data)
	{
		System.out.println("Queuing " + data);
		Node temp=new Node();
		temp.data=data;
		temp.next=null;
		
		if(first == null)
		{
			first=temp;
			return;
		}
		
		Node traverse = first;
		while(traverse.next != null)
		{
			traverse = traverse.next;
		}
		
		traverse.next = temp;
		
	}
	public static void display()
	{
		Node display=first;
		while(display != null)
		{
			System.out.println(display.data);
			display=display.next;
		}
		
	}
	public static int dequeue()
	{
		if(first == null)
		{
			return -1;
		}
		
		int data=first.data;
		System.out.println("DeQueuing " + data);
		
		Node temp = first;
		
		first=first.next;
		//Garbage collection
		temp.next = null;
		temp = null;
		
		return data;
		
	}
	public static void main(String[] args)
	{
		for(int i=0;i<100000;i++)
		{
			Queue.queue(i);
		}
		
		for(int i=0;i<100000;i++)
		{
			Queue.dequeue();
		}
		
		System.out.println(Queue.dequeue());
		//Queue.display();
	}
}
