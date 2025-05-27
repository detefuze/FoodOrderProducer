package com.ru.klimashd.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ru.klimashd.components.Producer;
import com.ru.klimashd.dto.BasketDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderProducerService {

    private final Producer producer;

    @Autowired
    public OrderProducerService(Producer producer) {
        this.producer = producer;
    }

    public String createFoodOrder(List<BasketDTO> foodOrder) throws JsonProcessingException {
        return producer.sendMessage(foodOrder);
    }
}