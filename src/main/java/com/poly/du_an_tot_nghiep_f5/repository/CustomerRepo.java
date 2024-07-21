package com.poly.du_an_tot_nghiep_f5.repository;

import com.poly.du_an_tot_nghiep_f5.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
