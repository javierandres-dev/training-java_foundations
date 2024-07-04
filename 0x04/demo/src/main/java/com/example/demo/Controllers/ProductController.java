package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.ProductEntity;
import com.example.demo.Repositories.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public ProductEntity createProduct(@RequestBody ProductEntity payload){
        return productRepository.save(payload);
    }

    @GetMapping
    public List<ProductEntity> getProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public ProductEntity getProduct(@PathVariable Long id){
        return productRepository.findById(id).orElseThrow(()-> new RuntimeException("Product not found"));
    }

    @PutMapping("/{id}")
    public ProductEntity updateProduct(@PathVariable Long id, @RequestBody ProductEntity request){
        ProductEntity product = productRepository.findById(id).orElseThrow(()-> new RuntimeException("Product not found"));
        product.setName(request.getName());
        product.setPrice(request.getPrice());
        return productRepository.save(product);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id){
        ProductEntity product = productRepository.findById(id).orElseThrow(()-> new RuntimeException("Product not found"));
        productRepository.delete(product);
        return "Product deleted";
    }
}
