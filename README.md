# University_Management_System

                       Project Description: University Management System

# 🎓 University Management System – Java + MySQL

A comprehensive desktop-based University Management System built using **Java (NetBeans)** and **MySQL (via XAMPP)**. This system enables role-based access and supports Admin, Faculty, and Student operations with full database integration.

---

## 🧰 Tech Stack

- **Frontend:** Java Swing (NetBeans)
- **Backend:** MySQL (phpMyAdmin, XAMPP)
- **Connectivity:** JDBC
- **IDE:** NetBeans
- **Platform:** Desktop Application

---

## 🎥 Feature Demo Sections

Below are detailed descriptions and demo recordings (GIFs/videos) for each core feature.  
➡️ Replace each placeholder with your actual screen recording links or GIF paths.

---

### 🔐 1. Login Feature  
Secure multi-role login system supporting **Admin**, **Faculty**, and **Student** logins. Each user is authenticated against the database and redirected to their dedicated dashboard.

🎥  ![Login](https://raw.githubusercontent.com/Ishmeetkaur36/University_Management_System
/main/media/loginFeature.gif)



---

### 🛡️ 2. Admin Panel  

#### ➕ Add Students  
Register new students by entering details such as name, department, semester, and contact. Each student is assigned a unique student ID stored in the database.

🎥 **Demo:** `media/addStudent.gif`

#### 👨‍🏫 Add Faculty  
Add new faculty members by assigning subjects, departments, and login credentials. Faculty data is securely stored and managed by the admin.

🎥 **Demo:** `media/admin_add_faculty.gif`

#### 🖊️ Update Student  
Edit existing student information such as contact, semester, or academic details using a searchable student list.

🎥 **Demo:** `media/admin_update_student.gif`

#### ✏️ Update Faculty  
Update faculty profiles when they change departments, subjects, or personal information.

🎥 **Demo:** `media/admin_update_faculty.gif`

#### ✅ Approve Faculty Leaves  
Review and approve/reject faculty leave requests with just a click. Approved leaves are logged and reflected in salary calculations.

🎥 **Demo:** `media/admin_approve_faculty_leave.gif`

#### 💸 Set Faculty Salary  
Set or update salary for faculty based on working days and leave data. Admin controls salary logic and amount.

🎥 **Demo:** `media/admin_set_salary.gif`

---

### 👨‍🏫 3. Faculty Login  

#### 📝 Apply for Leave  
Faculty can apply for leave by providing dates and reason. Requests are sent to the Admin for approval.

🎥 **Demo:** `media/faculty_apply_leave.gif`

#### 🎯 Set Result  
Upload or update subject-wise results for students. Faculty can only access subjects assigned to them.

🎥 **Demo:** `media/faculty_set_result.gif`

#### 💵 Check Salary  
Faculty can view their approved salary slip for the current month, including deductions if any.

🎥 **Demo:** `media/faculty_check_salary.gif`

#### 🧾 Approve Student Leaves  
Faculty can approve or reject student leave requests submitted through the student panel.

🎥 **Demo:** `media/faculty_approve_student_leave.gif`

---

### 👨‍🎓 4. Student Login  

#### 📤 Apply for Leave  
Students can request academic or personal leaves by submitting a form to their respective faculty.

🎥 **Demo:** `media/student_apply_leave.gif`

#### 📊 Check Result  
Students can view their subject-wise results once uploaded by faculty. The interface is clean and student-friendly.

🎥 **Demo:** `media/student_check_result.gif`

---

## 📁 Project Structure

