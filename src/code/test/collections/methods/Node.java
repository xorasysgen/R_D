package code.test.collections.methods;

public class Node {
	
	private Integer id;
	private Node next;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Node [id=");
		builder.append(id);
		builder.append(", next=");
		builder.append(next);
		builder.append("]");
		return builder.toString();
	}
	
	
}
