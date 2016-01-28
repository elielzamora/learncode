package com.learncode.datastructure.list;

import com.learncode.datastructure.list.Node;
import java.util.*;


public class LinkedList <Item>{
	Node<Item> head;
	
	/**
	 * constructor for linked list creates one node to 
	 * begin with
	 * @param i
	 */
	public LinkedList(Item i){
		this.head = new Node<Item>(i, null);
	}
	/**
	 * appends a node to the head
	 * @param item
	 */
	public void appendToHead(Item item){
		this.head = new Node<Item>(item, this.head);
	}
	/**
	 * appends to tail
	 * @param item
	 */
	public void append(Item item){
		Node<Item> temp = this.head;
		while(temp.hasNext()){
			temp = temp.next();
		}
		temp.setNext(new Node<Item>(item, null));
	}
	/**
	 * appends in the middle of the list after some fixed value 
	 * 
	 */
	public void appendAfter(int i, Item item){
		Node<Item> node = this.head;
		for(int x = 0; x < i; x++){
			if(node.next() != null) node = node.next();
			//else throw new exception 
		}
		if(node.next() != null)	{
			node.setNext(new Node<Item>(item, node.next()));
		}
	}
	/**
	 * return position in list as an integer 0 based
	 * where 0 is the head of the list
	 * @param item
	 * @param comp
	 * @return
	 */
	public int search(Item item, Comparator<Item> comp){
		// max running time 
		int counter = 0;
		Node<Item> node = this.head;
		while(node.hasNext() == true){
			if(comp.compare(item, node.getItem()) != 0){
				return counter;
			}
			counter ++;
		}
		return -1; // no results found // or return exception
	}
	/**
	 * the head is not deleted but the node is moved
	 * and replaced by head.next
	 */
	public void deleteHead(){
		this.head = this.head.next();
	}
	public void deleteAfter(int i){
		Node<Item> node = this.head;
		for(int x = 0; x < i; x++){
			if(node.next() != null) node = node.next();
			//else throw new exception 
		}
		if(node.next().next() != null)	{
			node.setNext(node.next().next());
		}
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
	public void clear(){
		this.head = null;
	}
	/**
	 * unit test 
	 * @param args
	 */
	public static void main(String... args){
		//TODO unit test
	}
}
