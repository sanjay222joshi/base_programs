package org.learn.datastructure.challenges;

public class FirstTree {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(20);		
		int[] numList =  {20, 15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
		
		for(int i : numList){
			tree.addNode(i);
		}
		
		tree.inOrderTraversal();
		System.out.println();
		
		tree.preOrderTraversal();
		System.out.println();
		
		tree.postOrderTraversal();	
	}

}

class BinaryTree{
	private int data;
	private BinaryTree left;
	private BinaryTree right;
	
	public BinaryTree(int headNode){
		this.data = headNode;
		this.left=null;
		this.right=null;
	}
	
	
	public void addNode(int num){
		if(num<this.data){
			if(this.left != null){
				this.left.addNode(num);
			}else{
				this.left = new BinaryTree(num);
			}
		}else{
			if(this.right != null){
				this.right.addNode(num);
			}else{
				this.right = new BinaryTree(num);
			}
		}
	}
	
	// Visit the node first, then left and right sub-trees
	public void preOrderTraversal(){
		System.out.print(this.data + " -> ");
		
		if(this.left != null){
			this.left.preOrderTraversal();
		}
		
		if(this.right != null){
			this.right.preOrderTraversal();
		}
	}
	
	// Visit left sub-tree, then node and then, right sub-tree
	public void inOrderTraversal(){
		if(this.left != null){
			this.left.inOrderTraversal();
		}
		
		System.out.print(this.data + " -> ");
		
		if(this.right != null){
			this.right.inOrderTraversal();
		}
	}
	
	// Visit left sub-tree, then right sub-tree and then the node
	public void postOrderTraversal(){
		if(this.left != null){
			this.left.postOrderTraversal();
		}
		
		if(this.right != null){
			this.right.postOrderTraversal();
		}
		
		System.out.print(this.data + " -> ");
	}
	
	
}
