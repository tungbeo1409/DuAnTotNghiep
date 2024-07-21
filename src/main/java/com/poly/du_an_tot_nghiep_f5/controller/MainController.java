package com.poly.du_an_tot_nghiep_f5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
    @GetMapping("")
    public String index() {
        return "user/home";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin/home";
    }
}
