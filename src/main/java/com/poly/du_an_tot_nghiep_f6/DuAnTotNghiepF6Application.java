package com.poly.du_an_tot_nghiep_f6;

import com.poly.du_an_tot_nghiep_f6.entity.*;
import com.poly.du_an_tot_nghiep_f6.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DuAnTotNghiepF6Application {

    public static void main(String[] args){
        SpringApplication.run(DuAnTotNghiepF6Application.class, args);
        System.out.println(
                "\n\n\n" +
                "==============================================================\n" +
                "===                       Hello World!                     ===\n" +
                "===            Welcome To WebApp F6 Application            ===\n" +
                "===          Chương Trình Đã Được Chạy Thành Công          ===\n" +
                "==============================================================" +
                "\n\n\n");
    }

}
