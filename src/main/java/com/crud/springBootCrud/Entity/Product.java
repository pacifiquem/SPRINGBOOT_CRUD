package com.crud.springBootCrud.Entity;

import javax.persistence.Table;
import javax.persistence.id;
import javax.persistence.name;
import javax.persistence.price;
import javax.persistence.quantity;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")

public class Product {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int price;
    private int quantity;

}