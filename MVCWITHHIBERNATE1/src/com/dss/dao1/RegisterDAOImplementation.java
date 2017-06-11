package com.dss.dao1;

import java.util.List;

import com.dss.model.Registerpojo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository("RegisterDAO")
public class RegisterDAOImplementation implements RegisterDAO
{
	@Autowired
	  private SessionFactory sessionFactory;
	public void saveform(Registerpojo registerpojo) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(registerpojo);
		
	}

	@SuppressWarnings("unchecked")
	public List<Registerpojo> display() {
		// TODO Auto-generated method stub
		return (List<Registerpojo>) sessionFactory.getCurrentSession().createCriteria(Registerpojo.class).list();
		
	}
	

}
