package com.ru.klimashd.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ru.klimashd.dto.BasketDTO;
import com.ru.klimashd.services.OrderProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/order", consumes = MediaType.APPLICATION_JSON_VALUE)
public class FoodOrderController {

    private static final Logger log = LoggerFactory.getLogger(FoodOrderController.class);
    private final OrderProducerService foodOrderService;

    @Autowired
    public FoodOrderController(OrderProducerService foodOrderService) {
        this.foodOrderService = foodOrderService;
    }

    @PostMapping("")
    public String createFoodOrder(@RequestBody List<BasketDTO> foodOrder) throws JsonProcessingException {
        log.info("Create food order request received");
        return foodOrderService.createFoodOrder(foodOrder);
    }
}
