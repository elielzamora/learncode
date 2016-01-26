package com.learncode.datastructure.basic;

import com.learncode.datastructure.list.Node;

public class Queue <Item>{
	Node<Item> head;
	Node<Item> tail;
	public Queue (){}
	public Queue (Item item){this.enqueue(item);}
	public boolean empty(){return this.head == null? true:false;}
	public void enqueue(Item item){
		if(!this.empty()){
			this.tail.setNext(new Node<Item>(item, null));
			this.tail = this.tail.next();
		}else{
			Node<Item> node = new Node<Item>(item, null);
			this.head = this.tail = node;
		}
	}
	public Item dequeue(){
		if(!this.empty()){
			Node<Item> temp = this.head;
			this.head = this.head.next();
			return temp.getItem();
		}else{
			//Throw new QueueEmptyException
			return null;
		}
	}
	public Item peek(){return this.head.getItem();}
	
	/**
	 * unit test
	 * @param args
	 */
	public static void main(String[] args) {
		// Create new Queue<Integer>
		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(new Integer(1));
		queue.enqueue(new Integer(2));
		queue.enqueue(new Integer(3));
		queue.enqueue(new Integer(4));
		queue.enqueue(new Integer(5));
		queue.dequeue(); // removes first item entered (1 in this case)
		queue.enqueue(new Integer(6));
		while(!queue.empty()){
			System.out.println(queue.dequeue());
		}
		// I think it is in good working order
	}

}
