package com.example.studentmanagementsystem.service

import com.example.studentmanagementsystem.model.Student
import com.example.studentmanagementsystem.repository.StudentRepository
import org.springframework.stereotype.Service

@Service
class StudentService(private val repository: StudentRepository) {

    fun getAllStudents(): List<Student> = repository.findAll()

    fun getStudentById(id: Long): Student =
        repository.findById(id).orElseThrow { RuntimeException("Student not found") }

    fun addStudent(student: Student): Student = repository.save(student)

    fun updateStudent(id: Long, updated: Student): Student {
        val existing = getStudentById(id)
        val toUpdate = existing.copy(
            name = updated.name,
            age = updated.age,
            email = updated.email,
            course = updated.course
        )
        return repository.save(toUpdate)
    }

    fun deleteStudent(id: Long) = repository.deleteById(id)
}
