
public class Product {
	
	private String name;
	private double price;
	private String productType;
	
	public Product(String name, double price, String productType) {
		this.name = name;
		this.price = price;
		this.productType = productType;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
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
	public String toString() {
		return name;
	}
}

