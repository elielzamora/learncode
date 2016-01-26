package com.learncode.datastructure.list;

public class BiNode<Item>{
	private BiNode<Item> next;
	private BiNode<Item> prev; // previous node
	private Item item;
	public BiNode(Item item, BiNode<Item> next, BiNode<Item> previous){
		this.setItem(item);
		this.setNext(next);
		this.setPrev(previous);
	}
	public BiNode(Item item, BiNode<Item> next){this(item, next, null);}
	
	public Item getItem(){ return this.item; }
	public void setItem(Item item){ this.item = item; }
	public BiNode<Item> next(){ return this.next; }
	public void setNext(BiNode<Item> next){ this.next = next;}
	public BiNode<Item>	prev(){return this.prev;}
	public void setPrev(BiNode<Item> prev){this.prev = prev;}
	public boolean hasNext(){return this.next == null? false: true;}
	public boolean hasPrev(){return this.prev == null? false: true;}
	
	
}
/**

*/