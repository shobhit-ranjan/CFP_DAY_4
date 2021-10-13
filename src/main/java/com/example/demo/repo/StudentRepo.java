package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Student;

//ALL THE CURD OPERATION
public interface StudentRepo extends CrudRepository<Student, Integer> {

}
