import jdk.jfr.StackTrace;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kk.Product;

import java.util.HashMap;

import static org.junit.Assert.*;

public class BasketTotalPriceTest {

	    Product apple, banana, lemon, peaches, orange;
	    Basket basket;

	    @Before
	    public void setUp()

	        // Products
	        apple = new Product("Apple", 100.0);
	        banana = new Product("Banana",  110.0);
	        orange = new Product("Orange", 80.0);
	        peaches = new Product("Peaches",  50.0);
	        lemon = new Product("Lemon",  60.0);
	        
	        // Basket
	        cart = new Basket();

	        cart.addItem(apple,2);
	        cart.addItem(banana,1);
	        cart.addItem(orange,3);
	        cart.addItem(peaches,2);
	        cart.addItem(lemon,4);
	    }

	    @Test
	    public void addItem() {
	        HashMap<Product, Integer> products = new HashMap<>();
	        products.put(apple, 2);
	        products.put(banana, 1);
	        products.put(orange, 3);
	        products.put(peaches, 2);
	        products.put(lemon, 4);

	        assertEquals(products, cart.getProducts());
	    }

	    

	    @Test
	    public void getTotalPrice() {
	        assertEquals("3450.0", String.valueOf(cart.getTotalPrice()));
	    }

	   
}
