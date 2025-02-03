package com.dependency.injection.course.entities;

import org.springframework.beans.factory.annotation.Autowired;

public class Order {

    private Integer idOrder;
    private Double basicValue;
    private Double discountPercentage;

    public Order(Integer idOrder, Double basicValue, Double discountPercentage) {
        this.idOrder = idOrder;
        this.basicValue = basicValue;
        this.discountPercentage = discountPercentage;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Double getBasicValue() {
        return basicValue;
    }

    public void setBasicValue(Double basicValue) {
        this.basicValue = basicValue;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", basicValue=" + basicValue +
                ", discountPercentage=" + discountPercentage +
                '}';
    }
}
