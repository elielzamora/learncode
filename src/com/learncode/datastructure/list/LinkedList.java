package com.learncode.datastructure.list;
import com.learncode.datastructure.list.Node;
public class LinkedList <Item>{
	Node<Item> head;
	
//	private class Node <Item>{
//		private Item item;
//		private Node next;
//		public Node(Item item, Node node){
//			this.item = item;
//			this.next = node;
//		}
//		public Item getItem(){ return this.item; }
//		public void setItem(Item item){ this.item = item; }
//		public Node next(){ return this.next; }
//		public void setNext(Node node){ this.next = node;}
//		public boolean hasNext(){return this.next == null? false: true;}
//	}

	public LinkedList(Item i){
		this.head = new Node<Item>(i, null);
	}
	public void append(Item item){
		Node<Item> temp = this.head;
		while(temp.hasNext()){
			temp = temp.next();
		}
		temp.setNext(new Node<Item>(item, null));
	}
	//TODO add iterator , add delete, add search, add more methods
	/**
	 * unit test 
	 * @param args
	 */
	public static void main(String... args){
		
	}
}
