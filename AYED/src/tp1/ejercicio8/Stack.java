package tp1.ejercicio8;

import java.util.List;
import java.util.ArrayList;

public class Stack <T> extends Sequence {
	private List<T> data;
	
	public Stack () {
		this.data = new ArrayList<>();
	}
	
	public void push (T dato) {
		this.data.add(data.size(),dato);
	}
	
	public T pop () {
		return this.data.remove(data.size()-1);
	}
	
	public T top() {
		return this.data.get(data.size() - 1);
	}
	
	public boolean isEmpty() {
		return this.data.isEmpty();
	}
	
	public int size() {
		return this.data.size();
	}
}
