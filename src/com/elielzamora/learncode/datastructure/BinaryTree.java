/**
 * Binary Tree:
 * - recursive data structure
 * 
 * * did not peek at the soulutions
 * references:
 * -http://cslibrary.stanford.edu/110/BinaryTrees.html
 * -https://en.wikipedia.org/wiki/Binary_tree
 * - this binary tree has a link to its parent
 */

package com.elielzamora.learncode.datastructure;

import java.lang.*;

/**
 * 
 * @author Eliel
 *
 */
public class BinaryTree <T> {
	/**
	 * if parent is null this node is the root of the tree
	 */
	private BinaryTree parent = null;
	private BinaryTree leftSibling = null;
	private BinaryTree rightSibling = null;
	private T data;
	
	// constructors
	public BinaryTree(T data){
		this.data = data;
	}
	public BinaryTree(T data, BinaryTree<T> left, BinaryTree<T> right){
		this.data = data;
		this.setLeftSibling(left);
		this.setRightSibling(right);
	}
	public BinaryTree(BinaryTree parent){
		this.parent = parent;
	}
	public BinaryTree(BinaryTree left, BinaryTree right){
		this.setLeftSibling(left);
		this.setRightSibling(right);		
	}
	// Getters and Setters
	public T getData(){
		return (T) this.data;
	}
	public void setData(T data){
		this.data = data;
	}
	public BinaryTree getParent(){
		return this.parent;
	}
	public void setParent(BinaryTree<T> parent){
		this.parent = parent;
	}
	public BinaryTree getLeftSibling() {
		return leftSibling;
	}
	public BinaryTree getRightSibling() {
		return rightSibling;
	}
	public void setLeftSibling(BinaryTree<T> leftSibling) {
		leftSibling.setParent(this);
		this.leftSibling = leftSibling;
	}
	public void setRightSibling(BinaryTree<T> rightSibling) {
		rightSibling.setParent(this);
		this.rightSibling = rightSibling;
	}
	public void setSiblings(BinaryTree<T> ls, BinaryTree<T> rs){
		setLeftSibling(ls);
		setRightSibling(rs);
	}
	// operations on the datastructure
	public BinaryTree<T> root(){
		BinaryTree<T> node = this;
		while(this.getParent() != null){
			node = node.getParent();
		}
		return node;
	}
	//Remove branch from rest of tree
	public BinaryTree<T> pluck(){
		BinaryTree<T> parent = this.parent;
		if (parent != null){
			if(parent.getLeftSibling() == this) parent.leftSibling = null;
			else if(parent.getRightSibling() == this) parent.rightSibling = null;
			//else //throw new Exception;
		}
		return this;
	}
	public BinaryTree<T> delete(){
		//TODO delete node ?
		return this.parent;
	}
	
	//TODO 
	
	
	
	/**
	 * unit test
	 * @param args
	 */
	public static void main(String args[]){
		//Create test BinaryTree<Integer>
		// Test tree
		/*				5
		 			8		3
		  		6	7		1 	5
		 */
		boolean test = true;
		// craziest variable definition ever!
		BinaryTree<Integer> tree = new BinaryTree<Integer>(
			new Integer(5),
			new BinaryTree<Integer>(
					new Integer(8), 
					new BinaryTree<Integer>(
							new Integer(6)
							),
					new BinaryTree<Integer>(
							new Integer(7)
							)
			),
			new BinaryTree<Integer>(
					new Integer(3),
					new BinaryTree<Integer>(
							new Integer(1)
							),
					new BinaryTree<Integer>(
							new Integer(5)
							)
			)
		);
		Integer temp = (Integer) tree.getData();
		if (temp.intValue() != 5) test = false;
		
		temp = (Integer) tree.getLeftSibling().getData();
		if (temp.intValue() != 8) test = false;
		
		temp = (Integer) tree.getRightSibling().getData();
		if (temp.intValue() != 3) test = false;
		
		temp = (Integer)tree.getLeftSibling().getLeftSibling().getData();
		if (temp.intValue() != 6) test = false;
		
		temp = (Integer) tree.getLeftSibling().getRightSibling().getData();
		if (temp.intValue() != 7) test = false;
		
		temp = (Integer)tree.getRightSibling().getLeftSibling().getData();
		if (temp.intValue() != 1) test = false;
		
		temp = (Integer) tree.getRightSibling().getRightSibling().getData();
		if (temp.intValue() != 5) test = false;
		
		if(test) System.out.println("BinaryTree<Integer> Unit test is a pass");
		else System.out.println("test failed");
	}
}
