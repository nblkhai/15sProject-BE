package com.cimb.sProject.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cimb.sProject.Dao.ProductRepo;
import com.cimb.sProject.entity.Products;



@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductRepo productRepo;
	
	@GetMapping("/products")
	public Iterable<Products> getProduct(){
		return productRepo.findAll();
	}
	
	// Add Product
	@PostMapping("/addProduct")
	public Products addProduct(@RequestBody Products products) {
		return productRepo.save(products);
	}
	
	//Edit products 
		@PutMapping("/editProducts")
		public Products editProducts(@RequestBody Products products) {
			Optional<Products> findProducts = productRepo.findById(products.getId());
			
			// kalau pas diedit moviesnya engga ada, bakalan munculin alert itu tp kalau berhasil bakalan ngesave Movies yang ada di requestbody
			if (findProducts.toString() == "Optional.empty")
				throw new RuntimeException("Prodict with this id" + products.getId() + "doesnt exist");
			return productRepo.save(products);

}
		
}
