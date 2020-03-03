package com.cts.training.StockPriceservice;

import java.util.List;
import java.util.Optional;

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

//import com.cts.training.dao.InitialPublicOfferingDAO;
//import com.cts.training.dao.StockExchangeDAO;
//import com.cts.training.dao.StockPriceDAO;
//import com.cts.training.model.InitialPublicOffering;
//import com.cts.training.model.StockExchange;
//import com.cts.training.model.StockPrice;
//import com.cts.training.service.StockExchangeService;
//import com.cts.training.service.StockPriceService;

@CrossOrigin(origins="*")
@RestController
public class StockPriceRestController {
	@Autowired
	StockPriceDAO stockPriceDAO;
	@Autowired
	StockPriceService stockPriceService;
	@GetMapping("/stockpriceall")
	public ResponseEntity<?>getallstockPrices() {
		List<StockPrice> list = stockPriceService.getAllStockPrices();
		if(list.size()>0)
		{
			return new ResponseEntity<List<StockPrice>>(list , HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("No users found",HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("/stockpriceid/{id}")
	public ResponseEntity<?> getElementById(@PathVariable("id") int id) {
		try {
			StockPrice stockPrice=stockPriceService.getElementById(id);
			return new ResponseEntity<StockPrice>(stockPrice,HttpStatus.FOUND);
		}catch(NoClassDefFoundError e){
			return new ResponseEntity<String>("No such user found",HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/stockpriceall")
	public ResponseEntity<StockPrice> save(@RequestBody StockPrice stockPrice){
		stockPriceService.insert(stockPrice);
		return new ResponseEntity<StockPrice>(stockPrice,HttpStatus.CREATED);
	}
	@DeleteMapping("/deletestockprice/{id}")
	public ResponseEntity<StockPrice> delete(@PathVariable int id){
		stockPriceService.deleteById(id);
		return new ResponseEntity<StockPrice>(HttpStatus.MOVED_PERMANENTLY);
	}
	@PutMapping("/updatestockPrice")
	public ResponseEntity<StockPrice> update(@RequestBody StockPrice stockPrice){
		stockPriceService.update(stockPrice);
		return new ResponseEntity<StockPrice>(stockPrice,HttpStatus.OK);
	}
}
