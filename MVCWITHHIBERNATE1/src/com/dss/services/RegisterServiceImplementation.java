package com.dss.services;

import java.util.List;

import javax.jdo.annotations.Transactional;

import com.dss.model.Registerpojo;
import com.dss.dao1.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("Registerservices")
public class RegisterServiceImplementation implements Registerservices
{
	@Autowired
	private RegisterDAO studentDao;
@Transactional
	public void saveform(Registerpojo registerpojo) {
		// TODO Auto-generated method stub
		studentDao.saveform(registerpojo);
	}
@Transactional
	public List<Registerpojo> display() {
		// TODO Auto-generated method stub
		return studentDao.display();
	}

}
