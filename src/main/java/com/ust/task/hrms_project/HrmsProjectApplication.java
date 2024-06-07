package com.ust.task.hrms_project;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HrmsProjectApplication {

    public static void main(String[] args) {
       
//        Employee employee = new Employee();
//        employee.setId(1);
//        employee.setName("raji");
//        employee.setDepartment("cse");
//        System.out.println(employee.toString());
    	
    	ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = (Employee) c.getBean("employee");
        System.out.println(employee.toString());
    }
}
