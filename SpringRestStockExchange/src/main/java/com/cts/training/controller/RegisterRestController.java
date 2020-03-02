package com.cts.training.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

import com.cts.training.dao.RegisterDAO;
import com.cts.training.dto.RegisterDTO;
import com.cts.training.service.RegisterService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class RegisterRestController {
	@Autowired
	RegisterDAO registerDAO;
	@Autowired
	RegisterService registerService;
	@GetMapping("/registerid/{id}")
	public ResponseEntity<?> getElementById(@PathVariable("id") int id) {
		try {
			RegisterDTO user=registerService.getUserById(id);
			return new ResponseEntity<RegisterDTO>(user,HttpStatus.FOUND);
		}catch(NoClassDefFoundError e){
			return new ResponseEntity<String>("No such user found",HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("/register")
	public ResponseEntity<?>getallusers() {
		List<RegisterDTO> list = registerService.getAllUsers();
		if(list.size()>0)
		{
			return new ResponseEntity<List<RegisterDTO>>(list , HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("No users found",HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/register")
	public ResponseEntity<RegisterDTO> save(@RequestBody RegisterDTO user){
		registerService.insert(user);
		return new ResponseEntity<RegisterDTO>(user,HttpStatus.CREATED);
	}
	@DeleteMapping("/register/{id}")
	public ResponseEntity<RegisterDTO> delete(@PathVariable int id){
		registerService.delete(id);
		return new ResponseEntity<RegisterDTO>(HttpStatus.MOVED_PERMANENTLY);
	}
	@PutMapping("/register")
	public ResponseEntity<RegisterDTO> update(@RequestBody RegisterDTO user){
		registerService.updateUser(user);
		return new ResponseEntity<RegisterDTO>(user,HttpStatus.OK);
	}
	@RequestMapping(value="/reg",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public String reg() {
		return "{\"reg\":\"ok\"}";
	}
	@RequestMapping(value="/activate",method= RequestMethod.PUT)
	public ResponseEntity<String> activate(@RequestBody String email){
		registerService.activate(email);
		return new ResponseEntity<String>(email,HttpStatus.CREATED);
	}
}