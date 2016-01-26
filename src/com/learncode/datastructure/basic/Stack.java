package com.learncode.datastructure.basic;
import com.learncode.datastructure.list.Node;
public class Stack<Item> {
	Node<Item> head;
	public Stack(){	}
	public Stack(Item item){this.push(item);}
	public boolean empty(){return this.head == null? true:false;}
	public void push(Item item){this.head = new Node<Item>(item, this.head);}
	public Item pop(){
		if(!this.empty()){
			Item temp = this.head.getItem();
			this.head = this.head.next();
			return temp;
		}else{
			//throw new StackUnderflowException;
			return null;
		}
	}
	public Item peek(){
		if(!this.empty()){
			return this.head.getItem();
		}else{
			//throw new StackUnderflowException
			return null;
		}
		
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// create new Stack<Integer>
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println(stack.empty());
		stack.push(new Integer(1));
		stack.push(new Integer(2));
		stack.push(new Integer(3));
		System.out.println(stack.empty());
		System.out.println(stack.peek());
		while(stack.peek() != null){
			System.out.println(stack.pop());
		}
		System.out.println(stack.empty());
	}

}
