package com.fibabank.fibabankcommercerestapi.Controller;

import com.fibabank.fibabankcommercerestapi.Model.CartModel;
import com.fibabank.fibabankcommercerestapi.Service.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/commerce/shopping")
public class CartController {
    @Autowired
    CartServiceImpl cartService;
    @GetMapping("/cart/create")
    public void createCart(@RequestBody CartModel cartModel){
        cartService.create(cartModel);


    }
}
