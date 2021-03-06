package Lecture05;

public class Node {

	public Object data;
	public Node next;
	
	public Node(Object d, Node n) {
		this.data = d;
		this.next = n;
	}
	public Node(Object d) {
		this.data = d;
		this.next = null;
	}
	public Node() {
		this(Double.NaN);
	}
	
	public double getData() { return (double)this.data; }
	public Node getNext() { return this.next; }
	public void setData(double data) { this.data = data; }
	public void setNext(Node next) { this.next = next; }
}