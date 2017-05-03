package com.innominds.persistence.model;

import java.io.Serializable;

public class OrderProxy implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -5783599392387372007L;
    private String orderNumber;

    public OrderProxy() {

    }

    public OrderProxy( String orderNumber ) {
        this.orderNumber = orderNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

}
