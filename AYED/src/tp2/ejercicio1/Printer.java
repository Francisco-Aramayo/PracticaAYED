package tp2.ejercicio1;

import tp1.ejercicio8.Queue;

public class Printer <T> {
	public void preOrden (BinaryTree<T> ab) {
		System.out.print(ab.getData() + "-");
		if (ab.hasLeftChild()) {
			this.preOrden(ab.getLeftChild());
		}
		if (ab.hasRightChild()) {
			this.preOrden(ab.getRightChild());
		}
	}
	public void inOrden (BinaryTree<T> ab) {
		if (ab.hasLeftChild()) {
			this.inOrden(ab.getLeftChild());
		}
		System.out.print(ab.getData() + "-");
		if (ab.hasRightChild()) {
			this.inOrden(ab.getRightChild());
		}
	}
	public void postOrden (BinaryTree<T> ab) {
		if (ab.hasLeftChild()) {
			this.postOrden(ab.getLeftChild());
		}
		if (ab.hasRightChild()) {
			this.postOrden(ab.getRightChild());
		}
		System.out.print(ab.getData() + "-");
		
	}
	
	public void porNiveles (BinaryTree<T> ab) {
		BinaryTree<T> dato = null;
		Queue<BinaryTree<T>> queue = new Queue<>();
		queue.enqueue(ab);
		queue.enqueue(null);
		while (!queue.isEmpty()) {
			dato = queue.dequeue();
			if (dato != null) {
				System.out.print(dato.getData());
				if (dato.hasLeftChild()) {
					queue.enqueue(dato.getLeftChild());
				}
				if (dato.hasRightChild()) {
					queue.enqueue(dato.getRightChild());
				}
			} else if (!queue.isEmpty()) {
				System.out.println("");
				queue.enqueue(null);
			}
		}
		System.out.println();
	}
}
