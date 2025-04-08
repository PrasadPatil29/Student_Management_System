package com.example.studentmanagementsystem.model

import jakarta.persistence.*

@Entity
data class Student(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String,
    val age: Int,
    val email: String,
    val course: String
)
