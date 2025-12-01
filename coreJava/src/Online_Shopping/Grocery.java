package Online_Shopping;

public class Grocery extends Product {

	public Grocery(String productId,String name,double price,int q) {
		super(productId,name,price,q);
	}
	

	@Override
	public void getDetails() {
		System.out.println("Grocery Id :"+getProductId()+"| Grocery Name :"+getName()+"| Grocery Price :"+getPrice()+"| Grocery Quantity :"+getQuantity());	
	}
	

}

