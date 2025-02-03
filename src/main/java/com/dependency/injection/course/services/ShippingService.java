package com.dependency.injection.course.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double ship(double orderValue) {
        if (orderValue < 100)
            return 20.0;
        if (orderValue > 100 && orderValue < 200)
            return 12.0;
        return 0.0;
    }
}
