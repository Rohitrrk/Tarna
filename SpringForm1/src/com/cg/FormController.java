package com.cg;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("session")
public class FormController {

	public ArrayList<String> populateCities(){
		ArrayList<String> cityList=new ArrayList<String>();
		cityList.add("India");
		cityList.add("Us");
		cityList.add("Uk");
		cityList.add("Srilanka");
		return cityList;
	}
	
	@RequestMapping(value="index")
	public String getHome(Model m){
		m.addAttribute("cList", populateCities());
		m.addAttribute("empl",new Employee());
		return "index";
	}
	@RequestMapping(value="store")
	public String storeData(@Valid @ModelAttribute("empl") Employee e,BindingResult br,Model m){
		if(br.hasErrors()){
			m.addAttribute("err", "has errors");
			return "index";
		}
		else{
			m.addAttribute("smsg","successful");
			return "index";	
		}
		
	}
	@RequestMapping("next")
	public  String getNext(Model m){
		ArrayList<String> list=new ArrayList<String>();
		list.add("USA");
		list.add("Canada");
		list.add("Africa");
		m.addAttribute("log",new Employee());
		m.addAttribute("cityList",list);
		return "next";
	}
	@RequestMapping("storeData")
	public  String validateData(Model m,@Valid @ModelAttribute("log") Employee emp,BindingResult br){
		String target=null;
		if(br.hasErrors())
		{
		target="next";	
		}
		else{
		// store in db	
			m.addAttribute("empl",new Employee());
			target="index";
		}
		return target;
	}
}
