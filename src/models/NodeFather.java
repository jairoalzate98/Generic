package models;

import java.util.ArrayList;

public class NodeFather<T> extends Node<T> {

	private T information;
	private ArrayList<Node<T>> childList;
	
	public NodeFather(T information) {
		super(information);
		this.information = information;
		childList = new ArrayList<>();
	}
	
	public void add(Node<T> node){
		childList.add(node);
	}

	public ArrayList<Node<T>> getChildList() {
		return childList;
	}

	public T getInformation() {
		return information;
	}

	@Override
	public String toString() {
		return String.valueOf(information);
	}
}