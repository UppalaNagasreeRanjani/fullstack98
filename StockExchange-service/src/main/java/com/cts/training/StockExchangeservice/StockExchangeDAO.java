package com.cts.training.StockExchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;


//import com.cts.training.model.StockExchange;

public interface StockExchangeDAO extends JpaRepository<StockExchange, Integer>  {

}
