package com.fibabank.fibabankcommercerestapi.Model;

import java.util.List;

public class CartModel {
    private long cartId;
    private String customerName;
    private double totalAmount;
    private List<CartProductModel> cartProducts;

    public long getCartId() {
        return cartId;
    }

    public void setCartId(long cartId) {
        this.cartId = cartId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<CartProductModel> getCartProducts() {
        return cartProducts;
    }

    public void setCartProducts(List<CartProductModel> cartProducts) {
        this.cartProducts = cartProducts;
    }
}
