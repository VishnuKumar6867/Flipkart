package com.example.flipKart.repository;

import com.example.flipKart.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository

public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findByItemNumber(long itemNumber);

//    public List<Flight> findByFromPlaceAndToPlaceAndStartDate(String fromPlace, String toPlace, Date startDate);

    public List<Item> findByStartDateAfterAndProductBlockedStatus(LocalDateTime startDate, Boolean blockedStatus);


}
