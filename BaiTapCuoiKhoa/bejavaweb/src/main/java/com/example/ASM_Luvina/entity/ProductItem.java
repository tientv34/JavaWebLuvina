package com.example.ASM_Luvina.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class ProductItem implements Serializable{
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart_id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product_id;
}
