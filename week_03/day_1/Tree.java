class Node
{
	int data;
	Node left;
	Node right;
}
class Tree
{

	public static void inOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	
	}
	
	public static void preOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println(root.data);
		preOrder(root.left);
		
		preOrder(root.right);	
	}
	public static void postOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}
	
	public static Node insert(int data, Node root) 
	{
		if (root == null) 
		{
		    Node newNode = new Node();
		    newNode.data = data;
		    return newNode;
		}
		
		if (data < root.data) 
		{
		    root.left = insert(data, root.left);
		} 
		else if (data >= root.data) 
		{
		    root.right = insert(data, root.right);
		}
		return root;
	}
	
	
	public static void main(String[] args)
	{
		
		Node root = new Node();
		root.data=20;
		Node left = new Node();
		left.data=10;
		Node right = new Node();
		right.data=30;
		Node leftleft = new Node();
		leftleft.data=5;
		Node leftright = new Node();
		leftright.data=15;
		Node rightleft = new Node();
		rightleft.data=25;
		Node rightright = new Node();
		rightright.data=35;
		
		root.left=left;
		root.left.left=leftleft;
		root.left.right=leftright;
		
		root.right=right;
		root.right.left=rightleft;
		root.right.right=rightright;
		
		/*System.out.println("inOrder");
		Tree.inOrder(root);
		System.out.println("PreOrder");
		Tree.preOrder(root);
		System.out.println("PostOrder");
		Tree.postOrder(root);*/
		
		
		Tree.insert(5,root);
		Tree.inOrder(root);
		
		
	}
}
