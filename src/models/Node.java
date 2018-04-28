package models;

import java.util.ArrayList;

public class Node<T> {

	private T information;
	private ArrayList<Node<T>> childs;
	
	public Node(T information){
		this.information = information;
		childs = new ArrayList<>();
	}

	public T getInformation() {
		return information;
	}
	
	public void addNode(Node<T> node){
		childs.add(node);
	}

	public ArrayList<Node<T>> getChilds() {
		return childs;
	}
}