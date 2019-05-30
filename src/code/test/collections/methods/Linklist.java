package code.test.collections.methods;

public class Linklist {

	private Node node;
	private Node first;
	private Node last;  
	private Integer size=0;
	
	public void addNode(Integer id) {
		size++;
		if(node==null){
			System.out.println("added1");
			Node n1=new Node();
			n1.setId(id);
			n1.setNext(null);
			node=n1;
			first=n1;
		}
		else {
			System.out.println("added");
			Node n1=new Node();
			n1.setId(id);
			n1.setNext(null);
			node.setNext(n1);
			last=n1;
		}
		
	}
	
	public Integer getSize() {
		return size;
	}
	
	public void getAll() {
		node=first;
		while (node!=null) {
			System.out.println("node " + node.getId());
			node=node.getNext();
		}
	}
	
	
	public static void main(String[] args) {
		Linklist l=new Linklist();
		
		l.addNode(25);
		l.addNode(6);
		l.addNode(96);
		l.addNode(323);
		l.addNode(235);
		l.addNode(9656);
		System.out.println("size of node" + l.getSize());
		
		l.getAll();
	}

}
