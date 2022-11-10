package com.fibabank.fibabankshoppingrestapi.Controller;

import com.fibabank.fibabankshoppingrestapi.Business.Dto.CartDto;
import com.fibabank.fibabankshoppingrestapi.Business.Service.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
// @RequestMapping("/shopping")
public class CartController {
    @Autowired
    CartServiceImpl cartService;

    @GetMapping("/cart/create")
    public void createCart(@RequestBody CartDto cartDto){
        cartService.create(cartDto);

    }

    @GetMapping("/cart/find/{id}")
    public CartDto getCartById(@PathVariable("id")long cartId){

        return cartService.find(cartId);
    }

    @GetMapping("/cart/checkout/{id}")
    public String setStatus(@PathVariable("id")long cartId){
        cartService.setStatus(cartId);

        return "Statü Değişti";
    }
}
