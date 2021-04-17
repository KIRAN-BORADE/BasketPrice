package com.kk;

public class Main {

	public static void main(String[] args) {
		

	        // Products
	        Product apple = new Product("Apple", 100.0);
	        Product banana = new Product("Banana",  110.0);
	        Product orange = new Product("Orange", 80.0);
	        Product peaches = new Product("Peaches",  50.0);
	        Product lemon = new Product("Lemon",  60.0);

	        // Bucket
	        Basket cart = new Basket();
	        cart.addItem(apple,2);
	        cart.addItem(banana,1);
	        cart.addItem(orange,3);
	        cart.addItem(peaches,2);
	        cart.addItem(lemon,4);
	        

	       
	        // Prints final cart
	        cart.print();
	}
	
}
