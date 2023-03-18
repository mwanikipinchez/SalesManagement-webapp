package com.bytetech.SalesManagementwebapp.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Supplier;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "order-table")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private List<Product> productsToOrder;
    private LocalDate dateOrdered;
    private LocalDate dateDelivered;
    private Supplier supplier;
    private String orderedBy;
}
