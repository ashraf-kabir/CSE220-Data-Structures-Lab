package Lab09.Task01;

public class Task01 {

	public Node root;

	/*
	 * Compute the "maxDepth" of a tree -- the number of nodes along the longest
	 * path from the root node down to the farthest leaf node.
	 */
	public int maxDepth(Node node) {
		if (node == null) {
			return 0;
		} else {
			/* compute the depth of each subtree */
			int lDepth = maxDepth(node.left);
			int rDepth = maxDepth(node.right);

			/* use the larger one */
			if (lDepth > rDepth) {
				return (lDepth + 1);
			} else {
				return (rDepth + 1);
			}
		}
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {

		Task01 tree = new Task01();

		tree.root = new Node(100);
		tree.root.left = new Node(90);
		tree.root.right = new Node(110);
		tree.root.left.left = new Node(80);
		tree.root.left.right = new Node(95);
		tree.root.right.left = new Node(105);
		tree.root.right.right = new Node(120);
		tree.root.right.left.left = new Node(102);
		tree.root.right.left.right = new Node(108);

		System.out.println("The height of tree is = " + tree.maxDepth(tree.root));
	}
}
