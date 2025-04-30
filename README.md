# Employee Salary Management (OOP Project)

This Java application demonstrates basic object-oriented programming principles using an employee salary management system. The project implements inheritance, encapsulation, data validation, and method overriding through employee classes.

## 🧩 Classes

### 1. `CommissionEmployee`
Represents an employee who is paid based on a commission rate.

**Fields:**
- `firstName`
- `lastName`
- `socialSecurityNumber`
- `grossSales`
- `commissionRate`

**Methods:**
- `earnings()`: Calculates pay based on gross sales and commission rate.
- `toString()`: Returns formatted employee info.

### 2. `BasePlusCommissionEmployee`
Inherits from `CommissionEmployee`. Adds a fixed base salary.

**Additional Field:**
- `baseSalary`

**Methods:**
- `earnings()`: Adds base salary to commission-based earnings.
- `toString()`: Overrides to include base salary details.

### 3. `Test`
Includes a `main` method to create and test employee objects.

## ✅ Features

- Input validation for all fields
- Object-oriented design with inheritance
- Clean separation of responsibilities

### 📄 License
This project was developed for educational purposes and is shared as a sample academic assignment.