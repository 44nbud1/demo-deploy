package com.postgre.demodeploy.repo;

import com.postgre.demodeploy.mode.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


@Repository
public
interface EmployeeRepository extends JpaRepository<Employee, Long>{

}