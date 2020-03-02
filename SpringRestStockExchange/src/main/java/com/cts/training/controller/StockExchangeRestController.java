package com.cts.training.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.dao.StockExchangeDAO;
import com.cts.training.model.StockExchange;
@CrossOrigin(origins="*")
@RestController
public class StockExchangeRestController {
	@Autowired
StockExchangeDAO stockexchangeDAO;
	@Autowired
	StockExchangeService stockexchangeService;
	@GetMapping("/stockexchangeid/{id}")
	public ResponseEntity<?> getStockExchangeById(@PathVariable("id") int id) {
		try {
			StockExchange stockexchange=stockexchangeService.getCompanyById(id);
			return new ResponseEntity<Company>(stockexchange,HttpStatus.FOUND);
		}catch(NoClassDefFoundError e){
			return new ResponseEntity<String>("No such stock found",HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("/stockexchange")
	public ResponseEntity<?>getallstockexchanges() {
		List<StockExchange> list = stockexchangeService.getAllStockExchanges();
		if(list.size()>0)
		{
			return new ResponseEntity<List<Stockexchange>>(list , HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("No stockexchanges found",HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/stockexchange")
	public ResponseEntity<StockExchange> save(@RequestBody StockExchange stockexchange){
		stockexchangeService.insert(stockexchange);
		return new ResponseEntity<StockExchange>(stockexchange,HttpStatus.CREATED);
	}
	@DeleteMapping("/stockexchange/{id}")
	public ResponseEntity<StockExchange> delete(@PathVariable int id){
		stockexchangeService.delete(id);
		return new ResponseEntity<StockExchange>(HttpStatus.MOVED_PERMANENTLY);
	}
	@PutMapping("/stockexchange")
	public ResponseEntity<StockExchange> update(@RequestBody StockExchange stockexchange){
		stockexchangeService.updateStockExchange(stockexchange);
		return new ResponseEntity<StockExchange>(stockexchange,HttpStatus.OK);
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
//}
