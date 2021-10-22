import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Brands {
	private Map<String, ArrayList<Product>> brands;
	
	public Brands() {
		brands = new TreeMap<String, ArrayList<Product>>();
		brands = new Ekart().initializeAllProductsAndBrands();
	}
	
	public Map<String, ArrayList<Product>> getAllProductsAndBrands() {
		return brands;
		
	}
	public Set<String> getAllBrands() {
		return brands.keySet();
	}
	
	public Set<String> getAllProducts() {
		Set<String> products = new HashSet<>();	
		for(String key : brands.keySet()) {
			Iterator<Product> i = brands.get(key).iterator();
			while(i.hasNext()) products.add(i.next().getName());
		}
		return products;
	}

	public ArrayList<Product> getAllProductWithBrands(String key) {
		return brands.get(key);
}
	public ArrayList<String> getProductWithType(String type) {
		ArrayList<String> products = new ArrayList<>();
		for(String key : brands.keySet()) {
			Iterator<Product> i = brands.get(key).iterator();
			while(i.hasNext()) {
				Product p = i.next();
				if(p.getProductType()==type) products.add(p.getName());
			}
		}
		return products;
	}
	
	public boolean addBrand(String name) {
		if(brands.containsKey(name)) return false;
		brands.put(name, null);
		return true;
	}
	
	public boolean addProduct(Product prod, String key) {
		if(brands.containsKey(key)) {
			ArrayList<Product> list = new ArrayList<>();
			list.add(prod);
			brands.put(key, list);
			return true;
		}
		return false;
	}
	
	public void addtoKart(Product prod) {
		Kart.getKart().addProduct(prod);
	}

}
