package com.cts.training.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.dao.StockExchangeDAO;
import com.cts.training.dao.StockPriceDAO;
import com.cts.training.model.StockExchange;
import com.cts.training.model.StockPrice;
import com.cts.training.service.StockPriceService;

@Service
public class StockPriceServiceImpl implements StockPriceService {
	@Autowired
	StockPriceDAO stockPriceDAO;
	@Override
	public StockPrice insert(StockPrice stockPrice) {
		StockPrice savestockPrice = stockPriceDAO.save(stockPrice);
		return savestockPrice;
	}
	@Override
	public StockPrice update(StockPrice stockPrice) {
		StockPrice stockPriceupdate = stockPriceDAO.save(stockPrice);
		return stockPriceupdate;
	}
	@Override
	public void deleteById(int id) {
		stockPriceDAO.deleteById(id);
	}
	@Override
	public StockPrice getElementById(int id) {
		Optional<StockPrice> stockPrice = stockPriceDAO.findById(id);
		StockPrice stockPriceid = stockPrice.get();
		return stockPriceid;
	}
	@Override
	public List<StockPrice> getAllStockPrices() {
		return stockPriceDAO.findAll();
	}
}
