package com.poly.du_an_tot_nghiep_f6.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    //Nhân Viên
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;

    String phone;
    String address;
    String email;

    String username;
    String password;
    String citizenId;//Căn Cước Công dân


    Date dateCreate;
    Date dateUpdate;

    String description;
    boolean status;
}
