package com.fibabank.fibabankshoppingrestapi.Controller;

import com.fibabank.fibabankshoppingrestapi.Business.Dto.CartProductDto;
import com.fibabank.fibabankshoppingrestapi.Business.Service.CartProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopping")
public class CartProductController {
    @Autowired
    CartProductServiceImpl cartProductService;
    @PostMapping("/cart/add")
    public void addCartProduct(@RequestBody CartProductDto cartProductDto){
        cartProductService.addCartProduct(cartProductDto);
    }
}
