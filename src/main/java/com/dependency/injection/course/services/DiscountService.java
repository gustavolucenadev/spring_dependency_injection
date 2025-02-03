package com.dependency.injection.course.services;

import org.springframework.stereotype.Service;

@Service
public class DiscountService {
    public double discount(double value, double percentage) {
        return value * percentage / 100;
    }
}
