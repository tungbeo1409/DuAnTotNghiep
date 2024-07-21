package com.poly.du_an_tot_nghiep_f6.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "address")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    //Địa Chỉ
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;

    @ManyToOne
    @JoinColumn(name="id_customer")
    Customer customer;

    String nameRecipient;
    String phone;

    String street;
    String city;
    String county;
    String ward;
    String addreseDetail;

    Date dateCreate;
    Date dateUpdate;

    String description;
    boolean status;

}
