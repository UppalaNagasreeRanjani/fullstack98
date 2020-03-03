package com.cts.training.service;

import java.util.List;

import com.cts.training.model.Company;
import com.cts.training.model.StockExchange;

public interface StockExchangeService {
	public StockExchange insert(StockExchange stockExchange);
	public void deleteById(int id);
	public StockExchange update(StockExchange stockExchanges);
	public List<StockExchange> getAllStockExchanges();
	public StockExchange getElementById(int id);
}
