package com.example.flipKart.service;

import com.example.flipKart.entity.Item;
import com.example.flipKart.entity.Product;
import com.example.flipKart.exceptions.ProductException;
import com.example.flipKart.model.ItemModel;
import com.example.flipKart.repository.ItemRepository;
import com.example.flipKart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class ItemServices {
    @Autowired
    ItemRepository itemRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    EntityManager em;


    public Item addItem(ItemModel model) throws ProductException {
        Product product = productRepository.findByProductName(model.getProductName());

        if(product == null){
            throw new ProductException("Product resource not found");
        }
        else if (model.getStartDate().isAfter(model.getEndDate())){
            throw new ProductException("Item start time should be before end time");
        }
        Item item = itemRepository.findByItemNumber(model.getItemNumber());
        if(item != null){
            throw new ProductException("Product with "+ item.getItemNumber() +" is already available");
        }
        item = new Item(model.getItemId(),model.getItemNumber(), model.getProductName(), product,
                model.getStartDate(), model.getEndDate(), model.getQuantity(),
                model.getItemPrice(), model.getFeatures());
        return itemRepository.save(item);
    }
    public double getItemPrice(int quantity, long itemNumber) {
        Item item = itemRepository.findByItemNumber(itemNumber);
        double price = item.getItemPrice();
        for (int i = 1; i <= quantity; i++) {
            if (quantity == i) {
                price = price * i;
            }
        }
            return price;
        }


}
