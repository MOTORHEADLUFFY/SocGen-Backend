package com.EmployeePortal.socgen.Service;

import java.util.Date;
import java.util.List;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeePortal.socgen.Entity.Employee;
import com.EmployeePortal.socgen.Entity.Response;
import com.EmployeePortal.socgen.Constants.Constants;
import com.EmployeePortal.socgen.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public Response saveEmployee(Employee employee) {
		employee.setDateOfBirth(new Date());
		Response response = new Response();
		try {
			employeeRepository.save(employee);
			response.setResponseCode(Constants.SUCCESS_CODE);
			response.setResponseMessage(Constants.POST_SUCCESS);
		} catch(ConstraintViolationException ex) {
			String s = "";
			response.setResponseCode(Constants.ERROR_CODE);
			for (ConstraintViolation<?> element : ex.getConstraintViolations()) {
				s += element.getMessage() + ",";
			}
			response.setResponseMessage(s);
		}
		return response;
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

}
