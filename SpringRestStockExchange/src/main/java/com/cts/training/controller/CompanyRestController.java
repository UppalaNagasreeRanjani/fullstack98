package com.cts.training.controller;

import java.util.List;
import java.util.Optional;

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

import com.cts.training.dao.CompanyDAO;
import com.cts.training.dao.RegisterDAO;
import com.cts.training.dto.RegisterDTO;
import com.cts.training.model.Company;
import com.cts.training.service.CompanyService;
import com.cts.training.service.RegisterService;
@CrossOrigin(origins="*")
@RestController
public class CompanyRestController {
	@Autowired
	CompanyDAO companyDAO;
	@Autowired
	CompanyService companyService;
	@GetMapping("/companyid/{id}")
	public ResponseEntity<?> getCompanyById(@PathVariable("id") int id) {
		try {
			Company company=companyService.getCompanyById(id);
			return new ResponseEntity<Company>(company,HttpStatus.FOUND);
		}catch(NoClassDefFoundError e){
			return new ResponseEntity<String>("No such company found",HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("/company")
	public ResponseEntity<?>getallcompanies() {
		List<Company> list = companyService.getAllCompanies();
		if(list.size()>0)
		{
			return new ResponseEntity<List<Company>>(list , HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("No companies found",HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/company")
	public ResponseEntity<Company> save(@RequestBody RegisterDTO company){
		companyService.insert(company);
		return new ResponseEntity<RegisterDTO>(company,HttpStatus.CREATED);
	}
	@DeleteMapping("/company/{id}")
	public ResponseEntity<RegisterDTO> delete(@PathVariable int id){
		companyService.delete(id);
		return new ResponseEntity<Company>(HttpStatus.MOVED_PERMANENTLY);
	}
	@PutMapping("/company")
	public ResponseEntity<Company> update(@RequestBody Company company){
		companyService.updateCompany(company);
		return new ResponseEntity<Company>(company,HttpStatus.OK);
	}
//	@RequestMapping(value="/reg",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
//	public String reg() {
//		return "{\"reg\":\"ok\"}";
//	}
//	@RequestMapping(value="/activate",method= RequestMethod.PUT)
//	public ResponseEntity<String> activate(@RequestBody String email){
//		companyService.activate(email);
//		return new ResponseEntity<String>(email,HttpStatus.CREATED);
//	}
//

}
