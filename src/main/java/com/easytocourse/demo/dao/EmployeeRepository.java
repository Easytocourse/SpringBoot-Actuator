package com.easytocourse.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easytocourse.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

}
