package com.easytocourse.demo.service;

import java.util.List;
import java.util.stream.*;
import java.util.Optional;
import java.util.OptionalInt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.easytocourse.demo.dao.EmployeeRepository;
import com.easytocourse.demo.model.Employee;

@Service
public class Employeeservice {
	
	@Autowired
	EmployeeRepository emprepo;

	public Employee saveemp(Employee emp) {
		System.out.println("inside save emp");
		 return emprepo.save(emp); 
	}

	public List<Employee> getallemloyees() {
		return emprepo.findAll();
	}

	public Optional<Employee> getempbyid(int id) {
		return emprepo.findById(id);
	}

	public ResponseEntity<Employee> updateemp(Employee emp) {
		Optional<Employee> e=emprepo.findById(emp.getId());
		if(e.isPresent())
		return new ResponseEntity<Employee>(emprepo.save(emp), HttpStatus.ACCEPTED) ;
		else
		return new ResponseEntity<Employee>(HttpStatus.BAD_REQUEST) ;
		
	}
	//sample test method
	public int maximum(List<Integer> list)
	{
		Integer max= list.stream().mapToInt(v->v).max().getAsInt();
		System.out.println("the max is "+max);
		return 43;
		
	}
}
