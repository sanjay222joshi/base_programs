package org.learn.datastructure.challenges;

public class MirrorTree {
	public static void main(String[] args) {
		Tree tree = new Tree(20);
		int[] numList =  {20, 15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
		
		for(int i : numList){
			tree.addNode(i);
		}
		
		tree.mirror();
	}
}

class Tree {
	private int data;
	private Tree left;
	private Tree right;

	public Tree(int headNode) {
		this.data = headNode;
		this.left = null;
		this.right = null;
	}

	public void addNode(int num) {
		if (num < this.data) {
			if (this.left != null) {
				this.left.addNode(num);
			} else {
				this.left = new Tree(num);
			}
		} else {
			if (this.right != null) {
				this.right.addNode(num);
			} else {
				this.right = new Tree(num);
			}
		}
	}

	public void mirror() {
		Tree temp;
		temp = this.left;
		this.left = this.right;
		this.right = temp;
		
		print();
	}

	public void print() {
		System.out.print(this.data + " -> ");
		
		if (this.left != null) {
			this.left.print();
		}
		
		if (this.right != null) {
			this.right.print();
		}
	}

}
