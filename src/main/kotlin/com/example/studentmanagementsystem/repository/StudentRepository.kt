package com.example.studentmanagementsystem.repository

import com.example.studentmanagementsystem.model.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository : JpaRepository<Student, Long>
