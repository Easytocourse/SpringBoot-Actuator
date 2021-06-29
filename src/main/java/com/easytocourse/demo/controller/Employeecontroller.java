package com.easytocourse.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easytocourse.demo.model.Employee;
import com.easytocourse.demo.service.Employeeservice;

@RestController
@RequestMapping("/Employee")
public class Employeecontroller {
	
	@Autowired
	Employeeservice empservice;
	

	@PostMapping("/addEmployee")   // adding emp details into the table
	public Employee addempliyee(@RequestBody Employee emp)
	{
		empservice.saveemp(emp);
		return emp;	
	}
	
	@GetMapping("/getEmployees")   // get the all rows form the table
	public List<Employee> getall()
	{
		return empservice.getallemloyees();
	}
	
	@GetMapping("/getEmployee/{id}")  //get emp by id
	public Optional<Employee> empbyid(@PathVariable("id")int id)
	{
		return empservice.getempbyid(id);
	}
	
	@PutMapping("/updateEmployee")
	public ResponseEntity<Employee> updateempliyee(@RequestBody Employee emp)
	{
		return empservice.updateemp(emp);
	}
	
}
