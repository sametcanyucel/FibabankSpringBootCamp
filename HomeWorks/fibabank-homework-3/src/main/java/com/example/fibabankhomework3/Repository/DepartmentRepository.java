package com.example.fibabankhomework3.Repository;

import com.example.fibabankhomework3.Entity.Department;
import com.example.fibabankhomework3.Entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartmentRepository extends CrudRepository<Department,Long> {
    @Query("select e from Employee e where e.department.departmentId=:departmentId")
    List<Employee> findAllByTeamID(@Param("departmentId") long departmentId);
}
