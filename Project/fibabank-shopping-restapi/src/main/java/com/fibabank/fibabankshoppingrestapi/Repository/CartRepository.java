package com.fibabank.fibabankshoppingrestapi.Repository;

import com.fibabank.fibabankshoppingrestapi.Entity.Cart;
import com.fibabank.fibabankshoppingrestapi.Entity.CartProduct;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CartRepository extends CrudRepository<Cart,Long> {
    @Query("select p from CartProduct p where p.cart.cartId=:cartId")
    List<CartProduct> getProductsByCartId(@Param("cartId") long cartId);

}
