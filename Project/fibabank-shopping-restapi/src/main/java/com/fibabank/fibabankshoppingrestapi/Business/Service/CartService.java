package com.fibabank.fibabankshoppingrestapi.Business.Service;

import com.fibabank.fibabankshoppingrestapi.Business.Dto.CartDto;
import com.fibabank.fibabankshoppingrestapi.Business.Dto.CartProductDto;

import java.util.List;

public interface CartService {
    public void create(CartDto cartDto);

    public CartDto find(long cartId);

    public void setStatus(long carId);


}
