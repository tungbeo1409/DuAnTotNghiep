package com.poly.du_an_tot_nghiep_f5.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "size")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Size {
    //Kích Thước
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;


    Date dateCreate;
    Date dateUpdate;

    String description;
    boolean status;
}
