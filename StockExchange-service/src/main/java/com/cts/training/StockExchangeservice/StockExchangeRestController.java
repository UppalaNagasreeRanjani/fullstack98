package com.cts.training.StockExchangeservice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import com.cts.training.dao.CompanyDAO;
//import com.cts.training.dao.StockExchangeDAO;
//import com.cts.training.model.Company;
//import com.cts.training.model.StockExchange;
//import com.cts.training.service.CompanyService;
//import com.cts.training.service.StockExchangeService;
@CrossOrigin(origins="*")
@RestController
public class StockExchangeRestController {
	@Autowired
	StockExchangeDAO stockExchangeDAO;
	@Autowired
	StockExchangeService stockExchangeService;
	@GetMapping("/stockexchangeall")
	public ResponseEntity<?>getallstockExchanges() {
		List<StockExchange> list = stockExchangeService.getAllStockExchanges();
		if(list.size()>0)
		{
			return new ResponseEntity<List<StockExchange>>(list , HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("No users found",HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("/stockexchangeid/{id}")
	public ResponseEntity<?> getElementById(@PathVariable("id") int id) {
		try {
			StockExchange stockExchange=stockExchangeService.getElementById(id);
			return new ResponseEntity<StockExchange>(stockExchange,HttpStatus.FOUND);
		}catch(NoClassDefFoundError e){
			return new ResponseEntity<String>("No such user found",HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/stockexchangeall")
	public ResponseEntity<StockExchange> save(@RequestBody StockExchange stockExchange){
		stockExchangeService.insert(stockExchange);
		return new ResponseEntity<StockExchange>(stockExchange,HttpStatus.CREATED);
	}
	@DeleteMapping("/deletestockexchange/{id}")
	public ResponseEntity<StockExchange> delete(@PathVariable int id){
		stockExchangeService.deleteById(id);
		return new ResponseEntity<StockExchange>(HttpStatus.MOVED_PERMANENTLY);
	}
	@PutMapping("/updatestockexchange")
	public ResponseEntity<StockExchange> update(@RequestBody StockExchange stockExchange){
		stockExchangeService.update(stockExchange);
		return new ResponseEntity<StockExchange>(stockExchange,HttpStatus.OK);
	}
}