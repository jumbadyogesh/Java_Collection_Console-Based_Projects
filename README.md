**🏢 Company Management System**

A console-based Java application designed to manage a company's organizational structure using OOP principles, ArrayList, and Generics.
The system models real-world relationships between Company, Department, and Employee entities and provides structured management operations through a menu-driven interface.

**🎯 Project Objective**
To implement a hierarchical company structure and perform CRUD and analytical operations using Java Collections and Generics.

**🧱 Core Entities**
**🏢 Company**
companyId
companyName
location
List<Department> departments

**🏬 Department**
deptId
deptName
List<Employee> employees

**👨‍💼 Employee**
empId
empName
designation
salary

**⚙️ Key Functionalities**
➕ Add new Department to Company
👤 Add new Employee to specific Department
📋 Display all Departments
👥 Display Employees of a Department
🔍 Search Employee by ID (across all departments)
💰 Update Employee salary by ID
❌ Delete Employee from Department
📊 Display Employees earning above a given salary
📈 Sort Employees by salary using Generics & Comparator
🏆 Identify Department with highest number of Employees
💻 Technical Implementation

Language: **Java**

**Concepts Used:**
Object-Oriented Programming (Encapsulation & Composition)
Java Collections Framework (ArrayList)
Generics for type safety
Comparator for sorting
Menu-driven programming logic

**🖥 Application Type**
Console-based structured management system demonstrating nested object relationships and dynamic list-based data handling.





