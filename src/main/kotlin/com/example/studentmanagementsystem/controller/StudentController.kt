package com.example.studentmanagementsystem.controller

import com.example.studentmanagementsystem.model.Student
import com.example.studentmanagementsystem.service.StudentService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/students")
class StudentController(private val service: StudentService) {

    @GetMapping
    fun getAllStudents(): List<Student> = service.getAllStudents()

    @GetMapping("/{id}")
    fun getStudentById(@PathVariable id: Long): Student = service.getStudentById(id)

    @PostMapping
    fun createStudent(@RequestBody student: Student): Student = service.addStudent(student)

    @PutMapping("/{id}")
    fun updateStudent(@PathVariable id: Long, @RequestBody student: Student): Student =
        service.updateStudent(id, student)

    @DeleteMapping("/{id}")
    fun deleteStudent(@PathVariable id: Long) = service.deleteStudent(id)
}
