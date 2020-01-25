package Lab09.Task03;

public class PreOrderTester {
	
	public Node root;
	
	public static void main(String[] args) {

		PreOrderTester tree = new PreOrderTester();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		

		PreOrder a = new PreOrder();
		a.preOrderPrint(tree.root);
		System.out.println();
	}
}
