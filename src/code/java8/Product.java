package code.java8;

public class Product {

	private Integer id;
	private Integer price;
	private String product;

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}


	public Product(Integer id, Integer price, String product) {
		super();
		this.id = id;
		this.price = price;
		this.product = product;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [id=");
		builder.append(id);
		builder.append(", price=");
		builder.append(price);
		builder.append(", product=");
		builder.append(product);
		builder.append("]");
		return builder.toString();
	}

	

}
