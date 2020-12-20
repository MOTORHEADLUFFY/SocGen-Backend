package com.EmployeePortal.socgen.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeePortal.socgen.Entity.Employee;
import com.EmployeePortal.socgen.Entity.Response;
import com.EmployeePortal.socgen.Service.EmployeeService;

@CrossOrigin(origins = "*")
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("/addEmployee")
	@ResponseBody
	public Response postEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}
	
	@GetMapping("getAllEmployees")
	@ResponseBody
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
	}
}
