package com.cts.training.service;

import java.util.List;


import com.cts.training.model.StockPrice;

public interface StockPriceService {
	public StockPrice insert(StockPrice  stockPrice );
	public void deleteById(int id);
	public StockPrice  update(StockPrice  stockPrices );
	public List<StockPrice > getAllStockPrices();
	public StockPrice  getElementById(int id);
}
