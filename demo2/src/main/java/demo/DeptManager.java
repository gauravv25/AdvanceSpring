package demo;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class DeptManager {

	private SessionFactory sf;

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	public void create(Dept d) {
		HibernateTemplate hibernateTemplate = new HibernateTemplate(sf);
		System.out.println("in create" + d);
		hibernateTemplate.save(d);
	}

	public void list() {
		HibernateTemplate hibernateTemplate = new HibernateTemplate(sf);
		System.out.println("in list");
		List<Dept> depts = (List<Dept>) hibernateTemplate.find("select d from Dept d");
		depts.forEach(item -> {
			System.out.println(item);
		});
	}

}
