package com.example.HealFitNest.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "Order")
public class Order {

    @Id
    private String orderId;
    private String userId;
    private String cartId ;
    private String addressId;
    private String status;
    private BigDecimal totalPrice;


}
