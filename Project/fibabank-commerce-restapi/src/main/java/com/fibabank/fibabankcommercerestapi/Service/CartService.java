package com.fibabank.fibabankcommercerestapi.Service;

import com.fibabank.fibabankcommercerestapi.Model.CartModel;

public interface CartService {
    public void create(CartModel cartModel);
    public void setCartStatus(long cartId);
}
