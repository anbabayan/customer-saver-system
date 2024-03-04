package com.task.customer_saver.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private String cluster;

    private String email;

    private String phone;

    public Customer(String name, String cluster, String email, String phone) {
        this.name = name;
        this.cluster = cluster;
        this.email = email;
        this.phone = phone;
    }
}
