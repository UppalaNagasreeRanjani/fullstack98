package com.cts.training.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.model.StockPrice;

public interface StockPriceRepo extends JpaRepository<StockPrice, Integer> {

}
