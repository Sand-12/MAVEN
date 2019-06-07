package in.ac.sharda.pizz_app.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import in.ac.sharda.pizz_app.domain.Product;
//4.) CREATED A REST CONTROLLER 

@RestController

public class CartController {
	// 5.) ADDED A LIST OF CART HAVING PRODUCT
	private List<Product> products = new ArrayList<>();

	public void addProduct(Product product) {
		this.products.add(product);
	}
	
	
	  
}
