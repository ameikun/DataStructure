package solution;

import dataelement.BinaryTree;

public class BinaryTreeTraversal {
	
	//二叉树的前序遍历
	public void preOrder(BinaryTree root ) {
		if (root != null) {
			System.out.println(root.getData());
			preOrder(root.getLeftTree());
			preOrder(root.getRightTree());
		}
	}
}
