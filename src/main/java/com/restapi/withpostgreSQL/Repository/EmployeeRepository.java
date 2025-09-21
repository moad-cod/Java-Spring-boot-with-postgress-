package com.restapi.withpostgreSQL.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.withpostgreSQL.Entitty.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
