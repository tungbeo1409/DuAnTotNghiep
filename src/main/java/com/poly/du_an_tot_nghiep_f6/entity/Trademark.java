package com.poly.du_an_tot_nghiep_f6.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "trademark")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trademark {
    //Thương Hiệu
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;


    Date dateCreate;
    Date dateUpdate;

    String description;
    boolean status;
}
