package com.cts.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.model.Register;
import com.cts.training.repo.RegisterRepo;
@CrossOrigin(origins="*")
@RestController
public class RegisterRestController {

	@Autowired
	RegisterRepo ur;
	@Autowired
	JavaMailSender jms;
	
	@GetMapping("/registerall")
	public List<Register> findAll() {
		return ur.findAll();
	}
	
	@GetMapping("/registerid/{id}")
	public Register findOne(@PathVariable int id) {
		Optional<Register> usr = ur.findById(id);
		Register us = usr.get();
		return us;
	}
	
	@PostMapping("/registerall")
	public Register save(@RequestBody Register usr) {
		Register us = ur.save(usr);
		try {
			SimpleMailMessage sm=new SimpleMailMessage();
			sm.setFrom("uppalaranjani98@gmail.com");
			sm.setTo(us.getEmail());
			sm.setSubject("testing mail");
			sm.setText("Account created click on <a href='http://localhost:4200/activate?"+us.getEmail()+"'>Click</a>");
			jms.send(sm);
			System.out.println("send mail");
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		return us;
	}
	
	@PutMapping(value="/registerall/activate")
	public String activateUser(@RequestBody String e) {
		String temp = e.split(":")[1];
		String email=temp.split("\"")[1];
		Register register = ur.findByEmail(email);
		if(register.getActive().equals("no")) {
			register.setActive("yes");
			ur.save(register);
			return "{\"result\":\"1\"}";
		}
		else
		return "{\"result\":\"0\"}";
	}
	@DeleteMapping("/deleteregister/{id}")
	public void delete(@PathVariable int id) {
		ur.deleteById(id);
	}
	
	@PutMapping("/updateregister")
	public Register update(@RequestBody Register usr) {
		Register us = ur.save(usr);
		return us;
	}
	@RequestMapping(value="/register",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	
	public String reg() {
		/* dependency spring boot starter mail"*/
		try {
			SimpleMailMessage sm=new SimpleMailMessage();
			sm.setFrom("uppalaranjani98@gmail.com");
			sm.setTo("uppalaranjani98@gmail.com");
			sm.setSubject("testing mail");
			sm.setText("Account created click on <a href='http://localhost:4200/activate?'>Click</a>");
			jms.send(sm);
			System.out.println("send mail");
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		return "{\"reg\":\"ok\"}";
	
		}
	}

