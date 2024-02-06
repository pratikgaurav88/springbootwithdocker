package com.oracle.studentservice.repository;

import com.oracle.studentservice.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {
}
