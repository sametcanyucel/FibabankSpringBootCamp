package com.fibabank.fibabankshoppingrestapi.Business.Dto;

import java.util.List;

public class CartDto {
    private long cartId;
    private String customerName;
    private byte cardStatus;
    private double totalAmount;
    private List<CartProductDto> cartProductDtos;

    public CartDto(long cartId, String customerName, byte cardStatus, List<CartProductDto> cartProductDtos) {
        this.cartId = cartId;
        this.customerName = customerName;
        this.cardStatus = cardStatus;
        this.cartProductDtos = cartProductDtos;
    }

    public CartDto() {
    }

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

    public byte getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(byte cardStatus) {
        this.cardStatus = cardStatus;
    }

    public List<CartProductDto> getCartProductDtos() {
        return cartProductDtos;
    }

    public void setCartProductDtos(List<CartProductDto> cartProductDtos) {
        this.cartProductDtos = cartProductDtos;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
