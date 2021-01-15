package com.example.demo;

import com.example.demo.component.DemoBean;
import com.example.demo.component.EmployeeBean;
import com.example.demo.controller.HelloRestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloworldDemoApplication {
	public static final Logger logger = LoggerFactory.getLogger(HelloworldDemoApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to Spring Boot");
		ApplicationContext context = SpringApplication.run(HelloworldDemoApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.info("Demo Bean = " + demoBean.toString());
		// logger.debug(context.getBean(HelloRestController.class));
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEmpID(101);
		employeeBean.setEmpName("Vijay");
		employeeBean.showEmployeeDetails();
	}
}
