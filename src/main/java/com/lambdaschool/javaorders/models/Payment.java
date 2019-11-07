package com.lambdaschool.javaorders.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long paymentid;

    @Column(nullable = false)
    private String type;

    @ManyToMany
    @JoinTable(name = "orderpayments", joinColumns = @JoinColumn(name = "paymentid"), inverseJoinColumns = @JoinColumn(name = "ordnum"))
    List<Order> orders = new ArrayList<>();
}
