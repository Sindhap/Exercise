package com.example.Demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Demo.Dao.EmployeeDAO;
import com.example.Demo.Model.Employee;

public class MainController {

	 @Autowired
	    private EmployeeDAO employeeDAO;

	    @RequestMapping("/")
	    @ResponseBody
	    public String welcome() {
	        return "Welcome to RestAPI";
	    }

	 
	    @RequestMapping(value = "/employees", 
	            method = RequestMethod.GET, 
	            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    public List<Employee> getEmployees() {
	        List<Employee> list = employeeDAO.getAllEmployees();
	        return list;
	    }

	   
	    @RequestMapping(value = "/employee/{empNo}", //
	            method = RequestMethod.GET, //
	            produces = { MediaType.APPLICATION_JSON_VALUE, //
	                    MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    public Employee getEmployee(@PathVariable("empNo") String empNo) {
	        return employeeDAO.getEmployee(empNo);
	    }

	    

	    @RequestMapping(value = "/employee", //
	            method = RequestMethod.POST, //
	            produces = { MediaType.APPLICATION_JSON_VALUE, //
	                    MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    public Employee addEmployee(@RequestBody Employee emp) {

	        System.out.println(" Creating employee: " + emp.getEmpId());

	        return employeeDAO.addEmployee(emp);
	    }

	  
	    @RequestMapping(value = "/employee",
	            method = RequestMethod.PUT, 
	            produces = { MediaType.APPLICATION_JSON_VALUE, 
	                    MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    public Employee updateEmployee(@RequestBody Employee emp) {

	        System.out.println(" Editing employee: " + emp.getEmpId());

	        return employeeDAO.updateEmployee(emp);
	    }

	  
	    @RequestMapping(value = "/employee/{empNo}", //
	            method = RequestMethod.DELETE, //
	            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    public void deleteEmployee(@PathVariable("empNo") String empNo) {

	        System.out.println(" Deleting employee: " + empNo);

	        employeeDAO.deleteEmployee(empNo);
	    }

}
