package com.ty.Crud;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.ty.Crud.entity.Employee;
import com.ty.Crud.repo.EmployeeRepo;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(CrudApplication.class, args);

		EmployeeRepo repo = run.getBean(EmployeeRepo.class);

		Employee emp = new Employee("M abcd", "m@gmail.com", 70000d);

		// saving employee
//		Employee savedEmp = repo.save(emp);
//		System.out.println(savedEmp);

		// update
//		emp.setEid(3);
//		Employee updatedEmp = repo.save(emp);
//		System.out.println(updatedEmp);

		// Fetch Employee By Id
//		Optional<Employee> opt = repo.findById(1);

//		if (opt.isPresent()) {
//			Employee employee = opt.get();
//			System.out.println(employee);
//		} else {
//			throw new RuntimeException("Employee Not Found");
//		}

//		Employee employee = opt.orElseThrow(() -> new RuntimeException("student not found"));
//		System.out.println(employee);

		// fetch all records
//		List<Employee> employees = repo.findAll();
//		System.out.println("==========Employee============");
//		for (Employee employee : employees) {
//			System.out.println(employee);
//			System.out.println("==================");
//		}

		// delete
//		repo.deleteById(7);
//		System.out.println("deleted");

//		System.out.println("Fetching by salary");
//		List<Employee> employees = repo.findBySalary(70000d);
//		System.out.println("==========Employee============");
//		for (Employee employee : employees) {
//			System.out.println(employee);
//			System.out.println("==================");
//		}

		// Pagination
//		int pageNumber = 1;
//		Pageable pageable = PageRequest.of(pageNumber-1, 2);
//		
//		Page<Employee> all = repo.findAll(pageable);
//		
//		List<Employee> employees = all.toList();
//		
//		System.out.println("==========Employee============");
//		for (Employee employee : employees) {
//			System.out.println(employee);
//			System.out.println("==================");
//		}

		// Sorting
//		String parameter = "salary";
//		List<Employee> employees = repo.findAll(Sort.by(parameter).descending());//by default it will sort in ascending order.
//		
//		System.out.println("==========Employee============");
//		for (Employee employee : employees) {
//			System.out.println(employee);
//			System.out.println("==================");
//		}

		// Filtering
//		Employee e = new Employee();
//		e.setSalary(40000d);
//		e.setName("A");
//
//		Example<Employee> ex = Example.of(e);
//
//		List<Employee> employees = repo.findAll(ex);
//
//		System.out.println("==========Employee============");
//		for (Employee employee : employees) {
//			System.out.println(employee);
//			System.out.println("==================");
//		}

	}

}
