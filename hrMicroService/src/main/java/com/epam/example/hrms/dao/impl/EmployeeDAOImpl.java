package com.epam.example.hrms.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.epam.example.hrms.dao.IEmployeeDAO;
import com.epam.example.hrms.model.Employee;
import com.epam.example.hrms.response.MockEmployeeResponse;

@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {
	@Autowired
	private MockEmployeeResponse employeesResponse;

	@Override
	public Employee find(String employeeId) {
		return new Employee();
	}

	@Override
	public List<Employee> findAll() {
		return employeesResponse.getEmployees();
	}
}