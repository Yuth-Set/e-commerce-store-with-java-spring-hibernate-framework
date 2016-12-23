package com.ecamstore.dao;

import com.ecamstore.model.Cart;

/**
 * Created by Yuth on 12/7/2016.
 */
public interface CartDao {
    Cart create(Cart cart);
    Cart read(String cartId);
    void update (String cartId, Cart cart);
    void delete (String cartId);
}
