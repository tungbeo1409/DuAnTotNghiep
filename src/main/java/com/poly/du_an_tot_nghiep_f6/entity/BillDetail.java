package com.poly.du_an_tot_nghiep_f6.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bill_detail")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillDetail {

    // Chi Tiết hóa đơn
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @ManyToOne
    @JoinColumn(name = "id_bill")
    Bill bill;

    @ManyToOne
    @JoinColumn(name = "id_product_detail")
    ProductDetail productDetail;

    int quantity;
    int price;
    int intoMoney;

    String description;
    boolean status;
}
