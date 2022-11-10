package com.fibabank.fibabankshoppingrestapi.Business.Service;

import com.fibabank.fibabankshoppingrestapi.Business.Dto.CartProductDto;
import com.fibabank.fibabankshoppingrestapi.Entity.CartProduct;
import com.fibabank.fibabankshoppingrestapi.Repository.CartProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartProductServiceImpl implements CartProductService{
    @Autowired
    CartProductRepository cartProductRepository;
    @Override
    public void addCartProduct(CartProductDto cartProductDto) {
        cartProductRepository.save(toEntity(cartProductDto));
    }

    private CartProduct toEntity(CartProductDto cartProductDto) {
        cartProductDto.setLineAmount(cartProductDto.getSalesPrice()*cartProductDto.getSalesQuantity());
        CartProduct cartProduct = new CartProduct();
        cartProduct.setCartProductId(cartProductDto.getCartProductId());
        cartProduct.setProductId(cartProductDto.getProductId());
        cartProduct.setLineAmount(cartProductDto.getLineAmount());
        cartProduct.setSalesPrice(cartProductDto.getSalesPrice());
        cartProduct.setSalesQuantity(cartProductDto.getSalesQuantity());
        return cartProduct;
    }
}
