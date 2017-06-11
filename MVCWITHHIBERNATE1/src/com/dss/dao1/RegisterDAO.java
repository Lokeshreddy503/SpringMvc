package com.dss.dao1;

import com.dss.model.Registerpojo;

import java.util.List;

public interface RegisterDAO
{
	
		  // To Save the form detail
		  public void saveform(Registerpojo registerpojo );
		  
		  // To get form details
		  public List<Registerpojo> display();
		

}
