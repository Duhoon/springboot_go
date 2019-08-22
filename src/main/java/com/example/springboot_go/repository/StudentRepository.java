package com.example.springboot_go.repository;

import com.example.springboot_go.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {}