package com.springcore.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	
	private int empId;
	private List<String> empName;
	private Set<String> empAddress;
	private Map<String,Integer> empCoursesMap;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public List<String> getEmpName() {
		return empName;
	}
	public void setEmpName(List<String> empName) {
		this.empName = empName;
	}
	public Set<String> getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(Set<String> empAddress) {
		this.empAddress = empAddress;
	}
	public Map<String, Integer> getEmpCoursesMap() {
		return empCoursesMap;
	}
	public void setEmpCoursesMap(Map<String, Integer> empCoursesMap) {
		this.empCoursesMap = empCoursesMap;
	}
	public Emp(int empId, List<String> empName, Set<String> empAddress, Map<String, Integer> empCoursesMap) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empCoursesMap = empCoursesMap;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}


