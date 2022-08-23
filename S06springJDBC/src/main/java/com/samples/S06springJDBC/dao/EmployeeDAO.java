package com.samples.S06springJDBC.dao;

import java.util.List;

import com.samples.S06springJDBC.dto.Employee;

public interface EmployeeDAO {
	
	int create(Employee employee) ;
	int update(Employee employee) ;
	int delete(int id);
	
	Employee read(int id);
	
	List<Employee>read();

}
