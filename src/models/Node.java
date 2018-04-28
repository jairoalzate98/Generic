package models;

public class Node<T> {

	private T information;
	private Node<T> nextNode;

	public Node(T information) {
		this.information = information;
	}

	public T getInformation() {
		return information;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "Node [information=" + information + "]";
	}
}