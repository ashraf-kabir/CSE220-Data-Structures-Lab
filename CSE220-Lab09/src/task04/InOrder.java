package task04;

public class InOrder {
	
	public void inOrderPrint(Node root) {
		if (root==null) {
		} else {
			inOrderPrint(root.left);
			System.out.print(root.data + " ");
			inOrderPrint(root.right);
		}
	}

}
