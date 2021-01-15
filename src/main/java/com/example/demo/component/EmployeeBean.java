package com.example.demo.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class EmployeeBean {
	private int empID;
	private String empName;
	
	@Autowired
	private DepartmentBean deptBean;
	public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);
	
	public EmployeeBean() {}
	
	@Autowired
	public EmployeeBean(DepartmentBean deptBean) {
		logger.trace("*** AutoWiring by using @Autowire annotation on constructor ***");
		this.deptBean = deptBean;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public DepartmentBean getDeptBean() {
		return deptBean;
	}

	@Autowired
	public void setDeptBean(DepartmentBean deptBean) {
		logger.trace("*** AutoWiring by using @Autowire annotation on Setter ***");
		this.deptBean = deptBean;
	}
	
	public void showEmployeeDetails() {
		logger.debug("Employee ID : {}", empID);
		logger.debug("Employee Name : {}", empName);
		deptBean.setDeptName("Information Technology");
		logger.debug("Department : {}", deptBean.getDeptName());
	}
}
