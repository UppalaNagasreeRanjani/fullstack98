package com.cts.training.StockPriceservice;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.cts.training.model.StockPrice;

public interface StockPriceDAO extends JpaRepository<StockPrice, Integer> {

}
