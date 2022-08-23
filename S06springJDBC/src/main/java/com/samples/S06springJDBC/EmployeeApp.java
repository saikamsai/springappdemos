package com.samples.S06springJDBC;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.samples.S06springJDBC.dao.EmployeeDAO;
import com.samples.S06springJDBC.dto.Employee;

/**
 * Hello world!
 *
 */
public class EmployeeApp {

	public static void main(String[] args) {
		// create the spring container
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S06springJDBC/SpringConfig.xml");

		EmployeeDAO employeeDao = (EmployeeDAO) springContainer.getBean("employeedao");
		// createEmployee(employeeDao);
		// updateEmployee(employeeDao);
		 //deleteEmployee(employeeDao);
		//readEmployee(employeeDao);
		readAllEmployee(employeeDao);
	}

	private static void readAllEmployee(EmployeeDAO employeeDao) {
		List<Employee>employees=employeeDao.read();
		System.out.println(employees);
		
	}

	private static void readEmployee(EmployeeDAO employeeDao) {
		Employee employee = employeeDao.read(2);
		System.out.println(employee);
	}

	private static void deleteEmployee(EmployeeDAO employeeDao) {

		employeeDao.delete(4);
	}

	private static void updateEmployee(EmployeeDAO employeeDao) {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setFirstName("Bob");
		emp.setLastName("Rocky");

		employeeDao.update(emp);

	}

	private static void createEmployee(EmployeeDAO employeeDao) {
		Employee emp = new Employee();
		emp.setId(4);
		emp.setFirstName("Jhon");
		emp.setLastName("M");

		employeeDao.create(emp);
	}
}