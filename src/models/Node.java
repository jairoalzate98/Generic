package models;

public class Node<T> {

	private T information;

	public Node(T information) {
		this.information = information;
	}

	public T getInformation() {
		return information;
	}

	@Override
	public String toString() {
		return "Node [information=" + information + "]";
	}
}