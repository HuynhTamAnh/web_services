package com.example.ss5.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "employees")
@Schema(description = "Employee entity representing employee information")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier of the employee", example = "1")
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "Name is required")
    @Schema(description = "Employee name", example = "Nguyen Van A")
    private String name;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    @Schema(description = "Employee email address", example = "nguyenvana@example.com")
    private String email;

    @Column(nullable = false)
    @NotBlank(message = "Position is required")
    @Schema(description = "Employee position/job title", example = "Software Developer")
    private String position;

    @Column(nullable = false)
    @NotNull(message = "Salary is required")
    @Positive(message = "Salary must be positive")
    @Schema(description = "Employee salary", example = "15000000.0")
    private Double salary;

    // Constructors
    public Employee() {}

    public Employee(String name, String email, String position, Double salary) {
        this.name = name;
        this.email = email;
        this.position = position;
        this.salary = salary;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}