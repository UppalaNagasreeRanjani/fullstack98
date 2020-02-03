package com.cts.training.dao;

import java.util.List;

import com.cts.training.model.StockExchange;

public interface StockExchangeDAO {

	public boolean saveStockExchange(StockExchange stock);

	public boolean updateStockExchange(StockExchange stock );

	

	public StockExchange getStockExchangetById(int id);

	public List<StockExchange> getAllStock();

	StockExchange getStockExchangeById(int id);




}
