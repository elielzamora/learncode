package com.learncode.datastructure.list;
import com.learncode.datastructure.list.Node;
public class LinkedList <Item>{
	Node<Item> head;
	
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
