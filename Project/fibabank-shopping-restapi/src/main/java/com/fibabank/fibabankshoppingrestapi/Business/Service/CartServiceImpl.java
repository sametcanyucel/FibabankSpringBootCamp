package com.fibabank.fibabankshoppingrestapi.Business.Service;

import com.fibabank.fibabankshoppingrestapi.Business.Dto.CartDto;
import com.fibabank.fibabankshoppingrestapi.Business.Dto.CartProductDto;
import com.fibabank.fibabankshoppingrestapi.Entity.Cart;
import com.fibabank.fibabankshoppingrestapi.Entity.CartProduct;
import com.fibabank.fibabankshoppingrestapi.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class CartServiceImpl implements CartService{
    @Autowired
    CartRepository cartRepository;
    @Override
    public void create(CartDto cartDto) {
        cartRepository.save(toEntity(cartDto));
    }

    @Override
    public CartDto find(long cartId) {
        return toCartDto(cartRepository.findById(cartId));
    }

    @Override
    public void setStatus(long carId) {
        Optional<Cart> optional = cartRepository.findById(carId);
        if (optional.isPresent()) {
            Cart cart = optional.get();
            cart.setCartStatus((byte) 1);
            cartRepository.save(cart);

        }
    }


    public List<CartProductDto> getProductsByCartId(long cartId) {
        List<CartProductDto>cartProductDtos=new ArrayList<>();
        List<CartProduct>cartProducts=cartRepository.getProductsByCartId(cartId);
        for (CartProduct cartProduct:cartProducts) {
            CartProductDto cartProductDto=new CartProductDto();
            cartProductDto.setCartProductId(cartProduct.getCartProductId());
            cartProductDto.setProductId(cartProduct.getProductId());
            cartProductDto.setLineAmount(cartProduct.getLineAmount());
            cartProductDto.setSalesPrice(cartProduct.getSalesQuantity());
            cartProductDto.setSalesQuantity(cartProduct.getSalesQuantity());
            cartProductDto.setCartId(cartProduct.getCart().getCartId());
            cartProductDtos.add(cartProductDto);
        }
        return cartProductDtos;
    }



    private Cart toEntity(CartDto cartDto) {
        Cart cart = new Cart();

        cart.setCustomerName(cartDto.getCustomerName());
        return cart;
    }

    private CartDto toCartDto(Optional<Cart> optional) {
        CartDto cartDto = new CartDto();
        if (optional.isPresent()) {
            Cart cart = optional.get();
            cartDto.setCartId(cart.getCartId());
            cartDto.setCustomerName(cart.getCustomerName());
            cartDto.setCardStatus(cart.getCartStatus());
            cartDto.setCartProductDtos(getProductsByCartId(cart.getCartId()));

        }
        return cartDto;
    }
}
