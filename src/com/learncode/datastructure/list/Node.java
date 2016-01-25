package com.learncode.datastructure.list;

public class Node <Item>{
	private Item item;
	private Node<Item> next;
	public Node(Item item, Node<Item> node){
		this.item = item;
		this.next = node;
	}
	public Item getItem(){ return this.item; }
	public void setItem(Item item){ this.item = item; }
	public Node<Item> next(){ return this.next; }
	public void setNext(Node<Item> node){ this.next = node;}
	public boolean hasNext(){return this.next == null? false: true;}
}
