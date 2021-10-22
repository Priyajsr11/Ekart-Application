import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Ekart {
	public Map<String, ArrayList<Product>> initializeAllProductsAndBrands() {
		Map<String, ArrayList<Product>> brands = new HashMap<String, ArrayList<Product>>();
	brands.put("Samsung", getSamsungProducts());
	brands.put("OnePlus", getOnePlusProducts());
	brands.put("Apple", getAppleProducts());
	brands.put("Google", getGoogleProducts());
	brands.put("Motorola", getMotorolaProducts());
	return brands;
	}
	
	private ArrayList<Product> getSamsungProducts() {
		ArrayList<Product> list = new ArrayList<>();
		list.add(new Product("Galaxy A3",18999.99,"Digital"));
		list.add(new Product("Note 10",39666.25,"Digital"));
		list.add(new Product("Smart TV",19999.52,"Electronics"));
		list.add(new Product("Smart Watch",9999.12,"Watch"));
		list.add(new Product("Speakers",18999.99,"Electronics"));
		return list;
		
	}
    private ArrayList<Product> getOnePlusProducts() {
    	ArrayList<Product> list = new ArrayList<>();
		list.add(new Product("9 Pro",18999.99,"Digital"));
		list.add(new Product("9 Pro Max",59666.25,"Digital"));
		list.add(new Product("Smart TV",29999.52,"Electronics"));
		list.add(new Product("Smart Watch",999.12,"Watch"));
		list.add(new Product("Speakers",2999.99,"Electronics"));
		return list;
    	
    }
    
    private ArrayList<Product> getAppleProducts() {
    	ArrayList<Product> list = new ArrayList<>();
		list.add(new Product("Iphone 13",79999.99,"Digital"));
		list.add(new Product("Iphone 13 Pro",139666.25,"Digital"));
		list.add(new Product("Smart TV",119999.52,"Electronics"));
		list.add(new Product("Smart Watch",59999.12,"Watch"));
		list.add(new Product("Speakers",28999.99,"Electronics"));
		return list;
    	
    }
    
    private ArrayList<Product> getGoogleProducts() {
    	ArrayList<Product> list = new ArrayList<>();
		list.add(new Product("Pixel 4",28999.99,"Digital"));
		list.add(new Product("Pixel 5",59666.25,"Digital"));
		list.add(new Product("Smart TV",89999.52,"Electronics"));
		list.add(new Product("Smart Watch",39999.12,"Watch"));
		list.add(new Product("Speakers",7999.99,"Electronics"));
		return list;
    	
    }
    
    private ArrayList<Product> getMotorolaProducts() {
    	ArrayList<Product> list = new ArrayList<>();
		list.add(new Product("Moto G3",18999.99,"Digital"));
		list.add(new Product("Moto K3",12665.25,"Digital"));
		list.add(new Product("Earphone",499.52,"Headphones"));
		list.add(new Product("Smart Watch",999.12,"Watch"));
		list.add(new Product("Speakers",899.99,"Electronics"));
		return list;
    	
    }
}
