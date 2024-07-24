package com.poly.du_an_tot_nghiep_f6.controller;

import com.poly.du_an_tot_nghiep_f6.entity.Color;
import com.poly.du_an_tot_nghiep_f6.entity.ProductDetail;
import com.poly.du_an_tot_nghiep_f6.repository.ColorRepo;
import com.poly.du_an_tot_nghiep_f6.repository.ProductDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class ProductDetailController {

    @Autowired
    ProductDetailRepo productDetailRepo;

    @Autowired
    ColorRepo colorRepo;

    @GetMapping("/product")
    public List<ProductDetail> getAllProductDetails() {
        return productDetailRepo.findAll();
    }
    @GetMapping("/color")
    public List<Color> getAllColor() {
        return colorRepo.findAll();
    }


}
