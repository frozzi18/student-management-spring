package com.tasto.studentmangement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasto.studentmangement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
