package pl.javastart;

public class List <E> {

	private E elements;
	Data<E> d = new Data<>();
	
	public void add(E e) {
		
		elements = e;
		d = new Data<>();
		d.addAll(elements);
	}
	
}
