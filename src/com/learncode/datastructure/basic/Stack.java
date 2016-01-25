package com.learncode.datastructure.basic;
import com.learncode.datastructure.list.Node;
public class Stack<Item> {
	Node<Item> head;
	public Stack(){
		
	}
	public Stack(Item item){
		this.push(item);
	}
	public boolean empty(){
		if (this.head == null) return true;
		else return false;
	}
	public void push(Item item){
		this.head = new Node<Item>(item, this.head);
	}
	public Item pop(){
		if(!this.empty()){
			Item temp = this.head.getItem();
			this.head = this.head.next();
			return temp;
		}else{
			//throw new StackEmptyException;
			return null;
		}
	}
	public Item peek(){
		if(!this.empty()){
			return this.head.getItem();
		}else{
			//throw new StackEmptyException
			return null;
		}
		
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
