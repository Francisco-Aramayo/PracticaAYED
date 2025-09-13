package tp1.ejercicio8;
import java.util.List;
import java.util.LinkedList;
public class Queue <T> extends Sequence{
	private List<T> data;
	
	public Queue () {
		this.data = new LinkedList<T>();
	}
	
	public void enqueue (T dato) {
		data.add(dato);
	}
	
	public T dequeue() {
		return data.remove(0);
	}
	
	public T head() {
		return data.get(0);
	}
	
	public int size() {
		return data.size();
	}
	
	public boolean isEmpty() {
		return this.data.isEmpty();
	}
	
	public String toString() {
		String str = "";
		for (T dato : data) {
			str += dato + "- ";
		}
		return str;
	}
}
