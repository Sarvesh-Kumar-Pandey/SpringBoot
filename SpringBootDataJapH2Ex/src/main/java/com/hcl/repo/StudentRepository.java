package com.hcl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
