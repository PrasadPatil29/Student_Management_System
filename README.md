
# Student Management System

This is a **Student Management System** built using **Kotlin** for the backend with **Spring Boot**, and **Thymeleaf** for the frontend. The application supports adding, updating, deleting, and viewing students. It also supports searching students by their ID.

## 🔧 Technologies Used

- **Backend**: Kotlin, Spring Boot
- **Frontend**: Thymeleaf
- **Database**: H2 (in-memory)
- **Build Tool**: Maven or Gradle
- **IDE**: IntelliJ IDEA / VS Code

---

## 🚀 How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/PrasadPatil29/Student_Management_System.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Student_Management_System
   ```

3. Build and run the project:
   - Using **IntelliJ**: Run the `Application.kt` file.
   - Using terminal:
     ```bash
     ./mvnw spring-boot:run
     ```

4. Open your browser and go to:
   ```
   http://localhost:9090/index.html
   ```

---

## 📷 UI Screenshots

### 🏠 Home - Add / Update Student Form
![image](https://github.com/user-attachments/assets/5e5d0f3b-7ede-4700-8e2e-ddbef7e9758d)


### 📋 View All Students
![image](https://github.com/user-attachments/assets/2cf44f1e-e7ca-4a2e-a1d0-78f547a6e290)


### 🔍 Search Student by ID
![image](https://github.com/user-attachments/assets/b64e54d0-99de-4011-aa52-80c333b59adc)


### ❌ Delete Student Confirmation
![image](https://github.com/user-attachments/assets/81e5f8ab-99d4-4307-896e-5f2971824593)


---

## 🧠 Features

✅ Add a new student  
✅ Update an existing student  
✅ Delete student with confirmation  
✅ View all students in tabular format  
✅ Get student details by ID

---

## 📁 Project Structure

```
src/
 └── main/
     ├── kotlin/
     │   └── com.example.student/
     │       ├── controller/
     │       ├── model/
     │       ├── repository/
     │       └── service/
     └── resources/
         ├── static/
         ├── templates/
         │   └── index.html
         └── application.properties
```

---

## 🌐 Localhost Endpoint

> Application runs at:  
> `http://localhost:9090/index.html`  
> From this UI, you can:
> - Add/update student details
> - Refresh to see all students
> - Search student by ID
> - Delete student with confirmation

---

## 🤝 Contribution

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

---

## 📜 License

This project is open source and free to use.

---
