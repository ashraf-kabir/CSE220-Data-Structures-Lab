package Lab09.Task04;

public class InOrderTester {

	public Node root;
	
	public static void main(String[] args) {

		InOrderTester tree = new InOrderTester();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		
		InOrder a = new InOrder();
		a.inOrderPrint(tree.root);
		System.out.println();
	}

}
