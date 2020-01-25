package Lab09.Task03;

public class PreOrder {

	public void preOrderPrint(Node root) {
		if (root == null) {
		} else {
			System.out.print(root.data + " ");
			preOrderPrint(root.left);
			preOrderPrint(root.right);
		}
	}
}
