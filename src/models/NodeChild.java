package models;

public class NodeChild<T> extends Node<T> {

	private T information;
	
	public NodeChild(T information) {
		super(information);
		this.information = information;
	}

	public T getInformation() {
		return information;
	}

	@Override
	public String toString() {
		return String.valueOf(information);
	}
}