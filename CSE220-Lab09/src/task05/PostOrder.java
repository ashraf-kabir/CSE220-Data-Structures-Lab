package task05;

public class PostOrder {

	public void postOrderPrint(Node root) {
		if (root == null) {
		} else {
			postOrderPrint(root.left);
			postOrderPrint(root.right);
			System.out.print(root.data + " ");
		}
	}
}
