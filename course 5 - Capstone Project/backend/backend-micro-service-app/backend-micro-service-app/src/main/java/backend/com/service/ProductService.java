package backend.com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.com.entity.Product;
import backend.com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public String storeProduct(Product product) {
		Optional<Product> result = productRepository.findById(product.getPid());
		if(result.isPresent()) {
			return "Product Id must be unique";
		}else {
			productRepository.save(product);
			return "Product stored successfully";
		}
	}
	
	public List<Product> findAllProducts() {
		return productRepository.findAll();
	}
}
