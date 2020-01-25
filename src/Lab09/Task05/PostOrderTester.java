package Lab09.Task05;

public class PostOrderTester {

	public Node root;
	
	public static void main(String[] args) {

		PostOrderTester tree = new PostOrderTester();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);

		PostOrder a = new PostOrder();

		a.postOrderPrint(tree.root);
		System.out.println();
	}

}
