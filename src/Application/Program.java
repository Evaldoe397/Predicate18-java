package Application;

import java.util.ArrayList;
import java.util.List;
import util.PriceUpdate;

import entities.Product;


public class Program {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.forEach(new PriceUpdate());
		
		list.forEach(System.out::println);
	}
}

	