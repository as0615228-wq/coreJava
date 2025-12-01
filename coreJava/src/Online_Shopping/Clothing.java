package Online_Shopping;

public class Clothing extends Product {
	public Clothing(String productId,String name,double price,int q) {
		super(productId,name,price,q);
	}
	

	@Override
	public void getDetails() {
		System.out.println("Clothes Id :"+getProductId()+"| Clothes Name :"+getName()+"| Clothes Price :"+getPrice()+"| Clothes Quantity :"+getQuantity());	
	}
	

}
