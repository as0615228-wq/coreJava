package Online_Shopping;

public abstract class Product {
	private String productId;
	private String name;
	private double price;
	private int quantity;
	
	public Product(String pi,String n, double p, int q) {
		this.productId=pi;
		this.name=n;
		this.price=p;
		this.quantity=q;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	
	public abstract void getDetails();

}