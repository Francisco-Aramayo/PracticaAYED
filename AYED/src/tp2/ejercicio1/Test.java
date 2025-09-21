package tp2.ejercicio1;

public class Test {
	public static void main (String [] args) {
		BinaryTree<Integer> raiz = new BinaryTree<>(1);
		BinaryTree<Integer> hi = new BinaryTree<>(2);
		hi.addLeftChild(new BinaryTree<Integer>(4));
		hi.addRightChild(new BinaryTree<Integer>(5));
		BinaryTree<Integer> hd = new BinaryTree<>(3);
		hd.addLeftChild(new BinaryTree<Integer>(7));
		raiz.addRightChild(hd);
		raiz.addLeftChild(hi);
	
		Printer impresora = new Printer<>();
		
		impresora.porNiveles(raiz);
		impresora.preOrden(raiz);
		
		System.out.println("Hojas: " + raiz.contarHojas());
		
	}
}
