package com.dependency.injection.course.services;

import com.dependency.injection.course.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;

    @Autowired
    private DiscountService discountService;

    public OrderService(ShippingService shippingService, DiscountService discountService) {
        this.shippingService = shippingService;
        this.discountService = discountService;
    }

    public double totalValue(Order order){
        return order.getBasicValue()
                + shippingService.ship(order.getBasicValue())
                - discountService.discount(order.getBasicValue(), order.getDiscountPercentage());
    }
}
