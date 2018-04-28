package controllers;

import models.Manager;
import models.Node;
import models.NodeChild;
import models.NodeFather;
import views.MainWindow;

public class Controller {

	private Manager manager;
	private MainWindow mainWindow;
	
	public Controller() {
		Node<String> b = new NodeFather<String>("Hola");
		manager = new Manager(b);
		Node<String> a = new NodeChild<String>("Hola 2");
		Node<String> c = new NodeFather<String>("Hola 3");
		Node<String> d = new NodeChild<String>("Hola 4");
		try {
			manager.addRoot(manager.getRoot(), a);
			manager.addRoot(manager.getRoot(), c);
			manager.addRoot(c, d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mainWindow = new MainWindow();
		mainWindow.paintTree(manager.getRoot());
	}
	
	public static void main(String[] args) {
		new Controller();
	}
}