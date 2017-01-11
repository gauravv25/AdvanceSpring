package demo;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppMain {

	public static void main(String args[]) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo4.xml");
		XML_Persist persist = context.getBean("xmlpersist", XML_Persist.class);
		Address address = new Address();
		address.setCity("Pune");
		address.setState("Maha");
		address.setLine1("Line1");
		address.setLine2("line2");
		Emp e = new Emp();
		e.setAddr(address);
		e.setBdate(new Date());
		e.setEmpno(101);
		e.setSalary(10000.0);
		
		
		
		persist.write(e, "test");
		context.close();
	}

}
