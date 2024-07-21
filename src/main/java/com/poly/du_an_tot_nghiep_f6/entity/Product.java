package com.poly.du_an_tot_nghiep_f6.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    //Sản Phẩm
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;

    @ManyToOne
    @JoinColumn(name = "id_directory")
    Directory directory;

    @ManyToOne
    @JoinColumn(name = "id_material")
    Material material;

    @ManyToOne
    @JoinColumn(name = "id_trademark")
    Trademark trademark;

    @ManyToOne
    @JoinColumn(name = "id_style")
    Style style;

    @OneToMany(mappedBy = "product")
    private List<Image> images;


    Date dateCreate;
    Date dateUpdate;

    String description;
    boolean status;
}
