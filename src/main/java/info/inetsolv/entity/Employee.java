package info.inetsolv.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {

	@XmlElement
	private Integer eno;
	@XmlElement
	private String name;
	@XmlElement
	private Double salary;
	
	
	public Employee(Integer eno, String name, Double salary) {
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}
