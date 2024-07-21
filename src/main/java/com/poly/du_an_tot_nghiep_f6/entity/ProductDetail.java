package com.poly.du_an_tot_nghiep_f6.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "product_detail")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetail {
    //Sản Phẩm Chi Tiết
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;

    @ManyToOne
    @JoinColumn(name = "id_size")
    Size size;

    @ManyToOne
    @JoinColumn(name = "id_color")
    Color color;

    Date dateCreate;
    Date dateUpdate;

    String description;
    boolean status;
}
