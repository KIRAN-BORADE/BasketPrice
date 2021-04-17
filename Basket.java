package com.kk;

import java.util.HashMap;

public class Basket {

	 private HashMap<Product, Integer> products;
	    private double totalPrice;
	    private int totalNumberOfProducts;

	    Basket() {
	        products = new HashMap<>();
	        totalPrice = 0;
	        totalNumberOfProducts = 0;
	    }

	    public HashMap<Product, Integer> getProducts() {
	        return products;
	    }

	    public int getTotalNumberOfProducts() {
	        return totalNumberOfProducts;
	    }


	    // Adds item to the Bucket
	    public void addItem(Product product, int quantity) {

	        if (!products.containsKey(product)) {
	            products.put(product, quantity);
	        }
	        else {
	            products.replace(product, products.get(product) + quantity);
	        }

	        totalPrice = product.getPrice() * quantity;
	        totalNumberOfProducts = products.size();

	        
	    }

	 
	    public double getTotalPrice() { return totalPrice;}
	    public void print() {
	        products.forEach(
	                (k, v) -> {
	                    System.out.println(k.getTitle() + " - " +
	                            v + " - " +
	                            k.getPrice() + " - " +
	                            k.getPrice() * v );
	                }
	        );
	    }
	   
	
}
