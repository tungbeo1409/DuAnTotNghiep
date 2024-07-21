package com.poly.du_an_tot_nghiep_f6.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "bill")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bill {
    // Hóa đơn
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @ManyToOne
    @JoinColumn(name = "id_employee")
    Employee employee;

    @ManyToOne
    @JoinColumn(name = "id_customer")
    Customer customer;

    int totalPrice;
    int reducedPrice;

    @ManyToOne
    @JoinColumn(name = "id_address")
    Address address;

    Date dateCreate;
    String description;
    boolean status;
}
