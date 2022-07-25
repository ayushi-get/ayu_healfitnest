package com.example.HealFitNest.Model;

import java.math.BigDecimal;

import lombok.*;

@Data
@Getter
@Setter
public class CartItem {
    private String itemId;
    private String itemName;
    private BigDecimal itemPrice;
    private int itemQuantity;

    public CartItem(String itemId, String itemName, BigDecimal itemPrice, int itemQuantity){
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }
}
