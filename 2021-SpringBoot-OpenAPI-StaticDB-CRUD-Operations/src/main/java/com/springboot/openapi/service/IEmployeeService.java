package com.springboot.openapi.service;

import com.springboot.openapi.model.Employee;

public interface IEmployeeService {
	
	public void createEmployee(Employee employee);
	  
    public Employee getEmployeeByEmployeeId(String Id);
    
    public Employee updateEmployee(Employee employee);
    
    public void deleteEmployee(String empId);

}
