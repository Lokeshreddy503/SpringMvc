package controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dss.model.Registerpojo;
import com.dss.services.Registerservices;

@Controller
public class StudentController {
	@Autowired
private Registerservices registerservices;
	
	
	@RequestMapping("/index")
	public String Form(Map<String, Object> map)
	{
		Registerpojo registerpojo = new Registerpojo();
		map.put("registerpojo",registerpojo);
		map.put("list",registerservices.display());
		return "registerpojo";
	}
	@RequestMapping(value="register.htm")
	public String action(@ModelAttribute Registerpojo registerpojo,BindingResult result,@RequestParam String action,Map<String, Object> map)
	{
		Registerpojo registerpojoResult = new Registerpojo();
		switch (action.toLowerCase())
		{
		case "add":
			registerservices.saveform(registerpojo);
			registerpojoResult = registerpojo;
			
			break;

		default:
			break;
		}
		
		
		
		return "registerpojo";
	}
	
}
