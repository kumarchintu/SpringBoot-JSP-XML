package info.inetsolv.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import info.inetsolv.entity.Employee;

@RestController
@RequestMapping(path="/emp")
public class EmployeeController {

	@RequestMapping(method=RequestMethod.GET)
	public String doSomeWork() {
		return "data";
	}
	
	@RequestMapping(path="/data",method=RequestMethod.GET)
	public List<Employee> doSomeMoreWork() {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1,"Deb",10000d));
		empList.add(new Employee(2,"Priyanka",200000d));
		return empList;
	}
	
	@RequestMapping(path="/data/X",method=RequestMethod.GET,produces="application/xml")
	public List<Employee> doSomeXMLWork() {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1,"Deb",10000d));
		empList.add(new Employee(2,"Abhi",200000d));
		return empList;
	}
}
