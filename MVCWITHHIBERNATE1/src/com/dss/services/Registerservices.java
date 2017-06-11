package com.dss.services;
import java.util.List;

import com.dss.model.*;

public interface Registerservices
{
	// To Save the form detail
	  public void saveform(Registerpojo registerpojo );
	  
	  // To get form details
	  public List<Registerpojo> display();

}
