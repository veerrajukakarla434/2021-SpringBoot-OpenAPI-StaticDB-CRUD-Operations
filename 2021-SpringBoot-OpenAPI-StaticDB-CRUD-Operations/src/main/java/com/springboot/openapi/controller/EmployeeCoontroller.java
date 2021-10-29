package com.springboot.openapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.openapi.model.Employee;
import com.springboot.openapi.service.IEmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class EmployeeCoontroller {

	@Autowired   //Spring ioc
	IEmployeeService employeeService;

	@Operation(summary = "Save Employees", description = "Save Employee into DataBases")
	@ApiResponses(value = { @ApiResponse(responseCode = "201", description = "Created Employee into DataBases", content = {@Content(mediaType = "application/json") }), 
	                        @ApiResponse(responseCode = "400", description = "Bad Request")})
	@PostMapping(value = "/employee")
	public ResponseEntity<Object> createEmployee(@RequestBody Employee employee) {

		employeeService.createEmployee(employee);
		return new ResponseEntity<Object>("Successfullt Created Employee", HttpStatus.OK);
	}

	@Operation(summary = "Get Employees", description = "Get Employee From DataBases")
	@GetMapping(value = "/employee/{id}")
	public ResponseEntity<Object> getEmployeeByEmployeeId(@PathVariable String id) {

		Employee response = null;
		response = employeeService.getEmployeeByEmployeeId(id);
		return new ResponseEntity<Object>(response, HttpStatus.OK);
	}

	@Operation(summary = "Update Employees", description = "Update Employee into DataBases")
	@PutMapping(value = "/employee")
	public ResponseEntity<Object> updateEmployee(@RequestBody Employee employee) {

		Employee response = null;
		response = employeeService.updateEmployee(employee);
		return new ResponseEntity<Object>(response, HttpStatus.OK);

	}

	@Operation(summary = "Delete Employees", description = "Delete Employee From DataBases")
	@DeleteMapping(value = "/employee/{id}")
	public ResponseEntity<Object> deleteEmployee(@PathVariable String id) {
		
		employeeService.deleteEmployee(id);
		return new ResponseEntity<Object>("Successfullt Deleted Employee", HttpStatus.OK);
	}
}
