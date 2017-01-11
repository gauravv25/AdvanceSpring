package demo;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "dmgr")
@EnableTransactionManagement
public class DeptManager {

	@Autowired
	private SessionFactory sf;

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Transactional(propagation = Propagation.REQUIRED)
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

	@Transactional(propagation = Propagation.REQUIRED)
	public void update(Dept d) {
		HibernateTemplate hibernateTemplate = new HibernateTemplate(sf);
		System.out.println("in update");
		hibernateTemplate.update(d);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(Dept d) {
		HibernateTemplate hibernateTemplate = new HibernateTemplate(sf);
		System.out.println("in delete");
		hibernateTemplate.delete(d);
	}

}
