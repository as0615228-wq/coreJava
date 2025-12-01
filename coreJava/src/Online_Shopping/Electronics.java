package Online_Shopping;

public class Electronics extends Product {
	public Electronics(String productId,String name,double price,int q) {
		super(productId,name,price,q);
	}
	

	@Override
	public void getDetails() {
		System.out.println("Electronics Id :"+getProductId()+"| Electronics Name :"+getName()+"| Electronics Price :"+getPrice()+"| Electronics Quantity :"+getQuantity());	
	}
	

}



