package com.example.Demo.Dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.Demo.Model.Employee;
import com.example.Demo.Model.Skill;
import com.example.Demo.Model.Department;
@Repository
public class EmployeeDAO {
	private static final Map<String, Employee> empMap = new HashMap<String, Employee>();

    static {
        initEmps();
    }

    private static void initEmps() {
    	
    	 Department dept1 = new Department("DO1","Developer");
    	 Department dept2 = new Department("DO2","databse");
    	 Department dept3 = new Department("DO3","UI");
    	 
    	 Skill skill1=new Skill(1,"Java");
    	 Skill skill2=new Skill(2,"Sql");
    	 Skill skill3=new Skill(1,"Angular");
    	 
        Employee emp1 = new Employee("E01", "David", "50000","Technical Lead", dept1,skill1);
        Employee emp2 = new Employee("E02", "Ravi", "40000","Manager", dept2,skill2);
        Employee emp3 = new Employee("E03", "Kavya", "55000","Software Engineer", dept3,skill3);
        
    }

    public Employee getEmployee(String empNo) {
        return empMap.get(empNo);
    }

    //add
    public Employee addEmployee(Employee emp) {
        empMap.put(emp.getEmpId(), emp);
        empMap.put(emp.getEmpName(), emp);
        empMap.put(emp.getEmpSalary(), emp);
        empMap.put(emp.getEmpDesignation(), emp);
        return emp;
    }

    //edit
    public Employee updateEmployee(Employee emp) {
        empMap.put(emp.getEmpId(), emp);
        return emp;
    }

    //delete
    public void deleteEmployee(String empNo) {
        empMap.remove(empNo);
    }

    public List<Employee> getAllEmployees() {
        Collection<Employee> c = empMap.values();
        List<Employee> list = new ArrayList<Employee>();
        list.addAll(c);
        return list;
    }
}
