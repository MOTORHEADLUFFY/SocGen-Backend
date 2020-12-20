package com.EmployeePortal.socgen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.EmployeePortal.socgen.Controller.EmployeeController;
import com.EmployeePortal.socgen.Entity.Employee;
import com.EmployeePortal.socgen.Enums.Gender;

@SpringBootTest
class SocgenApplicationTests {

	@Autowired
	EmployeeController employeeController;
	
    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }
    
    @Test
    public void checkInsertWithCorrectData() {
    	Employee employee = new Employee();
    	employee.setFirstName("TestName");
    	employee.setLastName("LastName");
    	employee.setDepartment("NoDept");
    	employee.setGender(Gender.M);
    	employee.setDateOfBirth(new Date());
    	
    	assertEquals("0", employeeController.postEmployee(employee).getResponseCode());
    	assertTrue(employeeController.getAllEmployees().size()>1);
    	
    }
    
    @Test
    public void checkInsertWithFirstNameMissing() {
    	Employee employee = new Employee();
    	employee.setFirstName("");
    	employee.setLastName("LastName");
    	employee.setDepartment("No-Dept");
    	employee.setGender(Gender.M);
    	employee.setDateOfBirth(new Date());
    	
    	assertEquals("1", employeeController.postEmployee(employee).getResponseCode());
    	
    }
    
    @Test
    public void checkInsertWithGenderMissing() {
    	Employee employee = new Employee();
    	employee.setFirstName("TestName");
    	employee.setLastName("LastName");
    	employee.setDepartment("asdas");
    	employee.setDateOfBirth(new Date());
  
    	assertEquals("1", employeeController.postEmployee(employee).getResponseCode());
    	
    }
    
    @Test
    public void checkInsertWithDateOfBirthMissing() {
    	Employee employee = new Employee();
    	employee.setFirstName("TestName");
    	employee.setLastName("LastName");
    	employee.setDepartment("No-Dept");
    	employee.setGender(Gender.M);
    	
    	assertEquals("1", employeeController.postEmployee(employee).getResponseCode());
    	
    }
    
    @Test
    public void checkInsertWithDepartmentMissing() {
    	Employee employee = new Employee();
    	employee.setFirstName("TestName");
    	employee.setLastName("LastName");
    	employee.setGender(Gender.M);
    	employee.setDateOfBirth(new Date());
    	
    	assertEquals("1", employeeController.postEmployee(employee).getResponseCode());
    	
    }
    
    

}
