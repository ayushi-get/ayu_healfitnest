package com.example.HealFitNest.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.HealFitNest.Model.Cart;

@Service
public interface CartService {
    public void addItem(String cartId, String itemId, int quantity);
    public List<Cart> showCart();
    public Cart showCartofId(String cartId);
    public void removeCart(String cartId);
    public int countItem(String cartId);
    public BigDecimal totalPrice(String cartId);
    public void clearCart(String cartId);
    public void removeItem(String cartId, String itemId);
    public void updateItemQuantity(String cartId, String itemId, int quantity);

    // void cartCheckout();
}
