package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import Entities.Product;
import Util.ProductPredicate;

public class Program {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//Utilizando uma classe interface com o Predicate
		//e instanciando na aplicação dentro do removeIf().
		list.removeIf(new ProductPredicate());
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}

	