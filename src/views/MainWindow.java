package views;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import models.Node;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTree jTree;
	private DefaultMutableTreeNode model;
	
	public MainWindow() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		model = new DefaultMutableTreeNode();
		jTree = new JTree(model);
		add(new JScrollPane(jTree), BorderLayout.CENTER);
		setVisible(true);
	}
	
	public void paintTree(Node<String> root) {
		model.removeAllChildren();
		DefaultMutableTreeNode uiRoot = new DefaultMutableTreeNode(root);
		model.add(uiRoot);
		for (int i = 0; i < root.getChilds().size(); i++) {
			createNode(uiRoot, root.getChilds().get(i));
		}
	}
	
	private void createNode(DefaultMutableTreeNode actual, Node<String> node) {
		if (node != null) {
			DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(node);
			actual.add(newNode);
			for (int i = 0; i < node.getChilds().size(); i++) {
				createNode(newNode, node.getChilds().get(i));
			}
		}
	}
}