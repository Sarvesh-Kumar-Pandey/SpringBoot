package com.in.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
