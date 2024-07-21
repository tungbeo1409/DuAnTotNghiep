package com.poly.du_an_tot_nghiep_f6.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "promotion_detail")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PromotionDetail {
    // Chi tiết khuyến mãi
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @ManyToOne @JoinColumn(name = "id_promotion")
    Promotion promotion;

    @ManyToOne @JoinColumn(name = "id_product_detail")
    Product productDetail;

    int percentDiscount;

    Date dateCreate;
    Date dateUpdate;
}
