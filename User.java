
public class User {

	public static void main(String[] args) {
		Brands b = new Brands();
		System.out.println(b.getAllProductsAndBrands());
		System.out.println(b.getAllBrands());
		System.out.println(b.getAllProducts());
		System.out.println(b.getProductWithType("Electronics"));
		b.addBrand("Redmi");
		b.addProduct(new Product("SmartPhone", 12999.25, "Digital"), "Redmi");
		
		Product p = b.getAllProductWithBrands("Google").get(0);
		b.addtoKart(p);
		System.out.println(Kart.getKart().getTotal());
		b.addtoKart(b.getAllProductWithBrands("Samsung").get(2));
		System.out.println(Kart.getKart().getTotal());
	}
}
