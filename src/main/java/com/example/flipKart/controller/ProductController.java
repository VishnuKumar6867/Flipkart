package com.example.flipKart.controller;

import com.example.flipKart.entity.Item;
import com.example.flipKart.entity.Product;
import com.example.flipKart.model.ItemModel;
import com.example.flipKart.service.ItemServices;
import com.example.flipKart.service.ProductService;
import com.example.flipKart.exceptions.ProductException;
import com.example.flipKart.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flipKart")
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
      ItemServices itemService;

    // @Autowired
    // private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "Product";

    @GetMapping("/getAllProducts")
    public ResponseEntity<List<Product>> getAllproducts() {
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }
    @PostMapping("/register")
    public ResponseEntity<Product> registerProduct(@RequestBody ProductModel productModel) throws ProductException {
        Product product = productService.registerProduct(productModel);
//        kafkaTemplate.send(TOPIC, airline + " Successfully registered");
        return new ResponseEntity<>(product, product != null ? HttpStatus.OK:HttpStatus.NO_CONTENT);
    }
    @PutMapping("/block/{product}")
    public ResponseEntity<Product> blockAirline(@PathVariable("product") String product) throws ProductException {
        Product productEntity = productService.blockProduct(product);
//        kafkaTemplate.send(TOPIC, airline + " Successfully Blocked");
        return new ResponseEntity<>(productEntity, productEntity != null ? HttpStatus.OK : HttpStatus.NO_CONTENT);
    }
    @PutMapping("/unblock/{product}")
    public ResponseEntity<Product> unBlockProduct(@PathVariable("product") String product) throws ProductException {
        Product productEntity = productService.unBlockProduct(product);
//        kafkaTemplate.send(TOPIC, airline + " Successfully UnBlocked");
        return new ResponseEntity<>(productEntity, productEntity != null ? HttpStatus.OK : HttpStatus.NO_CONTENT);
    }
    @PostMapping("/additem")
    public ResponseEntity<Item> addItem(@RequestBody ItemModel itemModel) throws ProductException {
        Item item = itemService.addItem(itemModel);
//        kafkaTemplate.send(TOPIC, flight + " Successfully registered");
        return new ResponseEntity<>(item, item != null ? HttpStatus.OK : HttpStatus.NO_CONTENT);
    }
    @GetMapping("/item-price/{quantity}/{itemNumber}")
    public double getPrice(@PathVariable int quantity, @PathVariable long itemNumber) {
        return itemService.getItemPrice(quantity,itemNumber);
    }


}

