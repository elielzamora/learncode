package com.learncode.datastructure.list;

import com.learncode.datastructure.list.Node;
import java.util.*;

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
	public int search(){
		//TODO return position as a number :)
		return 0;
	}
	//TODO finish linked list iterator functionality
	private class LinkedListIterator implements Iterator{
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	//TODO add iterator , add delete, add search, add more methods
	/**
	 * unit test 
	 * @param args
	 */
	public static void main(String... args){
		
	}
}
