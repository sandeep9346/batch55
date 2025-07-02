package com.vucbe.springapp08.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vucbe.springapp08.model.Employee;

@RestController
@RequestMapping("sandeep/s1")
public class EmployeeController {
	
	@GetMapping("/sandy1")
	String GetempDetails() {
		return "Hello Sandeep..!!";
	}
	@GetMapping("/sandy2")
	Employee GetempDetails2() {
		return new Employee(111,"Sam",150000.00,23,"KPHB");
	}
	@GetMapping("/sandy3")
	List<Employee> GetempDetails3(){
		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee(567,"Ram",13400.00,23,"Hyderabad"));
		emp.add(new Employee(568,"Madhav",15600.00,25,"Mumbai"));
		emp.add(new Employee(569,"Rathi",56000.00,27,"Delhi"));
		emp.add(new Employee(570,"Rekha",78000.00,28,"Vizag"));
		emp.add(new Employee(571,"Sam",53400.00,30,"Warangal"));
		
		return emp;
	}
	@GetMapping("/sandy7/san")
	Employee GetempDetails4(@RequestParam int empid,@RequestParam String empname,@RequestParam double empsal,
			@RequestParam int empage,@RequestParam String empaddress) {
		return new Employee(empid,empname,empsal,empage,empaddress);
	}
	@PostMapping("/sandy4")
	@ResponseStatus(HttpStatus.CREATED)
	Employee PostempDetails(@RequestBody Employee employee) {
		return employee;
	}

	@PutMapping("/sandy5/{id}")
	Employee UpdateempDetails(@RequestBody Employee employee,@PathVariable int id) {
		return employee;
	}
	@DeleteMapping("/sandy6/{id}")
	String DeleteempDetails(@PathVariable int id) {
		return "Deleted Employee Details Successfully with ID : "+id;
}
}
