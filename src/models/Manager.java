package models;

public class Manager {

	private Node<String> root;
	
	public Manager (Node<String> root){
		this.root = root;
	}
	
	public void addRoot(Node<String> actual, Node<String> node) throws Exception{
		if (actual.getClass().getSimpleName().equalsIgnoreCase("NodeFather")) {
			actual.addNode(node);
		}else{
			throw new Exception("No se puede agregar hijo");
		}
	}

	public Node<String> getRoot() {
		return root;
	}
}