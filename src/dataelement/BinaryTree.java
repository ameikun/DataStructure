package dataelement;

import solution.BinaryTreeTraversal;

public class BinaryTree {
	private int data;
	private BinaryTree leftTree;
	private BinaryTree rightTree;
	BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
	
	public BinaryTree() {}
	public BinaryTree(int data,BinaryTree leftTree,BinaryTree rightTree) {
		super();
		this.data = data;
		this.leftTree = leftTree;
		this.rightTree = rightTree;
	}
	public void preOrder(BinaryTree root) {
		binaryTreeTraversal.preOrder(root);
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinaryTree getLeftTree() {
		return leftTree;
	}
	public void setLeftTree(BinaryTree leftTree) {
		this.leftTree = leftTree;
	}
	public BinaryTree getRightTree() {
		return rightTree;
	}
	public void setRightTree(BinaryTree rightTree) {
		this.rightTree = rightTree;
	}

}
