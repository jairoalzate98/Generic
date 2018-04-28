package controllers;

import models.Manager;
import models.Node;

public class Controller {

	private Manager manager;
	
	public Controller() {
		manager = new Manager();
		manager.add(new Node<Integer>(2));
		System.out.println(manager.getHead());
	}
	
	public static void main(String[] args) {
		new Controller();
	}
}