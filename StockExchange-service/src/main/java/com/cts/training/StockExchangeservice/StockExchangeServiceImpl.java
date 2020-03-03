package com.cts.training.StockExchangeservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.cts.training.dao.CompanyDAO;
//import com.cts.training.dao.StockExchangeDAO;
//import com.cts.training.model.Company;
//import com.cts.training.model.StockExchange;
//import com.cts.training.service.StockExchangeService;
@Service
public class StockExchangeServiceImpl  implements StockExchangeService{
	@Autowired
	StockExchangeDAO stockExchangeDAO;
	@Override
	public StockExchange insert(StockExchange stockExchange) {
		StockExchange savestockExchange = stockExchangeDAO.save(stockExchange);
		return savestockExchange;
	}
	@Override
	public StockExchange update(StockExchange stockExchange) {
		StockExchange stockExchangeupdate = stockExchangeDAO.save(stockExchange);
		return stockExchangeupdate;
	}
	@Override
	public void deleteById(int id) {
		stockExchangeDAO.deleteById(id);
	}
	@Override
	public StockExchange getElementById(int id) {
		Optional<StockExchange> stockExchange = stockExchangeDAO.findById(id);
		StockExchange stockExchangeid = stockExchange.get();
		return stockExchangeid;
	}
	@Override
	public List<StockExchange> getAllStockExchanges() {
		return stockExchangeDAO.findAll();
	}
}
