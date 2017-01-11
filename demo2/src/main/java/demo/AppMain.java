package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.Dept;
import demo.DeptManager;

public class AppMain {

	public static void main(String args[]) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DeptManager mgr = context.getBean("dmgr", DeptManager.class);
		Dept d = new Dept();
		d.setDeptno(122);
		d.setDname("HR");
		d.setLoc("Pune");
		mgr.create(d);
		mgr.list();
		context.close();
	}

}
