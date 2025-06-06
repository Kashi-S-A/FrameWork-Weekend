package com.ty.Crud.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ty.Crud.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	// Custom queries
//	@Query("select e from Employee e where e.salary=?1")
	@Query("select e from Employee e where e.salary=:empSalary")
	public List<Employee> getBySalary(Double empSalary);

	@Query("select e from Employee e where e.name=:name and e.salary=:salary")
	public List<Employee> getByNameSalary(String name, Double salary);

	// Custom methods
	public List<Employee> findBySalary(Double salary);

	public List<Employee> findByName(String name);

	public List<Employee> findBySalaryAndName(Double salary, String name);
}
