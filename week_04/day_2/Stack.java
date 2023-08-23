class Node
{
	int data;
	Node next;
}


class Stack
{
     public static Node top = null;
	 
	     
     public static void push(int data)
     {
     	Node temp = new Node();
     	temp.data = data;
     	temp.next = null;
     	
     	if(top == null)
     	{
     		top = temp;
     	}		
     	else
     	{
     		//temp.next = top;
     		//top = temp;
     		
     		temp.next=top;
     		top=temp;
     	}    	
     }
     
     public static void display()
     {
     	Node traverse = top;
     	while(traverse != null)
     	{
     		System.out.print(traverse.data+" ");
     		traverse = traverse.next;
     	}
     	
     }
     
     public static int pop()
     {
     	      if(top != null)
     	       {
     	       		int data = top.data;
     	       		Node temp = top;
     	       		top=top.next;
     	       		//temp.next = null;
     	       		//temp = null;
     	       		//System.gc();
     	       		return data;
     	       		
     	       }
     	       return -1;
     }
	     
	     
     public static void main(String[] args)
     {
	Stack.pop();
	for(int i=0;i<10;i++)
	{
	    Stack.push(i);	
	}
	  
	Stack.display(); 
	   
	for(int i=0;i<5;i++)
	{
	    System.out.println(Stack.pop());	
	}
     }    
	
}
