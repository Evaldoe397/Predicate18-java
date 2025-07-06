package Application;

import java.util.ArrayList;
import java.util.List;
import Entities.Product;


public class Program {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//Substituindo o uso da classe/interfaceFuncional Predicate só
		//que agora pelo uso de um métodoão estático na classe Product.
		list.removeIf(Product::nonStaticProductPredicate);
		
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}

	