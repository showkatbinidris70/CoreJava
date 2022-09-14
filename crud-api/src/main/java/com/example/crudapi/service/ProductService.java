package com.example.crudapi.service;

import com.example.crudapi.model.ProductEntity;
import org.springframework.stereotype.Service;
import com.example.crudapi.repository.ProductRepository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public ProductEntity save(ProductEntity productEntity){
        productEntity.setCreatedAt(LocalDateTime.now());
        return productRepository.save(productEntity);
    }

    public List<ProductEntity> fetchProductList()
    {
        return productRepository.findAll();
    }
    public ProductEntity findById(Integer id)
    {
        return productRepository.findById(id).orElseThrow(()->new RuntimeException("Product not found"));
    }
    public ProductEntity updateProduct(ProductEntity productEntity, Integer id) {
        ProductEntity entity = productRepository.findById(id).orElseThrow(()->new RuntimeException("Product not found"));
        entity.setName(productEntity.getName());
        entity.setDescription(productEntity.getDescription());
        return productRepository.save(entity);
    }

    public void deleteProductById(Integer id)
    {
        productRepository.deleteById(id);
    }

}
