package models;

public class Manager {

	private Node<Integer> head;
	
	public void add(Node<Integer> node){
		if (head != null) {
			Node<Integer> actual = head;
			while(actual.getNextNode() != null){
				actual = actual.getNextNode();
			}
			actual.setNextNode(node);
		}else{
			head = node;
		}
	}

	public Node<Integer> getHead() {
		return head;
	}
}