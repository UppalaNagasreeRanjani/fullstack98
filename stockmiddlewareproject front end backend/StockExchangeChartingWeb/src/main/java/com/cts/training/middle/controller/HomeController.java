package com.cts.training.middle.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.training.bean.User;
import com.cts.training.dao.UserDAO;
@Controller
public class HomeController {
	
	@Autowired
	private UserDAO userDAO;
	//@GetMapping("/")-->In Spring 4.3 version and Above
	@RequestMapping("/")
	public String indexPage(Model model) {
		model.addAttribute("message", "Welcome to Spring MVC");
//		List<String> names=new ArrayList<String>();
//		addNames(names);
//		List<User> users=userDAO.getAllUsers();
//		
//		model.addAttribute("list",users);
		return "index";
	}
private void addNames(List<String> names) {
	names.add("Yasmin");
	names.add("Akhil");
	names.add("Harshitha");
	names.add("Tanu");
}
}