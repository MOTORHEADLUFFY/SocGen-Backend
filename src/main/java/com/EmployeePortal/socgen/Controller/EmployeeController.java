package com.EmployeePortal.socgen.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeePortal.socgen.Constants.Constants;
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
		Response response = new Response();
		if (employee.getDepartment() == "" || employee.getFirstName() == "" || employee.getLastName() == "") {
			response.setResponseCode(Constants.ERROR_CODE);
			response.setResponseMessage(Constants.POST_ERROR);
		} else {
			return service.saveEmployee(employee);
		}
		return response;
	}

	@GetMapping("getAllEmployees")
	@ResponseBody
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}
}
