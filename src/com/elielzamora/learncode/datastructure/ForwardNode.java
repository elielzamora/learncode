package com.elielzamora.learncode.datastructure;

public class ForwardNode <T>{
	private ForwardNode<T> nextNode;
	private T data;
	public ForwardNode(ForwardNode<T> next, T data){
		this.nextNode = next;
		this.data = data;
	}
	public T getData (){
		return this.data;
	}
	public void setData(T data){
		this.data = data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
