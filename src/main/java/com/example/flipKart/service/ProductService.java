package com.example.flipKart.service;

import com.example.flipKart.entity.Product;
import com.example.flipKart.exceptions.ProductException;
import com.example.flipKart.model.ProductModel;
import com.example.flipKart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductService {
    @Autowired
    ProductRepository repository;
    public List<Product> getAllProducts()
    {
        return repository.findAll();
    }
    public  Product registerProduct(ProductModel model) throws ProductException{
        Product product = repository.findByProductName(model.getProductName());
        if(product != null){
            throw new ProductException("Product with "+ product.getProductName() +" name is already available");
        }
        product = new Product(model.getProductId(),model.getProductName(),model.getContactNumber(),model.getContactAddress(), false);
        return repository.save(product);
    }
    public Product blockProduct(String product) throws ProductException {
        Product productEntity = repository.findByProductName(product);
        if(productEntity == null){
            throw new ProductException("No Product found with "+product+" name");
        }else if(productEntity.getBlockedStatus()){
            throw new ProductException(product+" is already Blocked");
        }
        productEntity.setBlockedStatus(true);
        return repository.saveAndFlush(productEntity);
    }
    public Product unBlockProduct(String product) throws ProductException {
        Product productEntity = repository.findByProductName(product);
        if(productEntity == null){
            throw new ProductException("No Product found with "+product+" name");
        }else if(!productEntity.getBlockedStatus()){
            throw new ProductException(product+" is already Un-Blocked");
        }
        productEntity.setBlockedStatus(false);
        return repository.saveAndFlush(productEntity);
    }


}
