package com.poly.du_an_tot_nghiep_f5.repository;

import com.poly.du_an_tot_nghiep_f5.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
