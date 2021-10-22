import java.util.ArrayList;
import java.util.Iterator;

public class Kart {
	private static Kart kart;
	ArrayList<Product> list = new ArrayList<>();
	public static Kart getKart() {
		if(kart==null) {
			kart = new Kart();
			return kart;
		}
		return kart;
	}
	public void addProduct(Product prod) {
		list.add(prod);
		
	}
	public void removeProduct(Product prod) {
		list.remove(prod);
	}
	public double getTotal() {
		double d = 0;
		Iterator<Product> i = list.iterator();
		while(i.hasNext()) {
			d = d+i.next().getPrice();
	    }
		return d;
	

}
}
