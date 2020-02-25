package com.cts.training.restresources;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.cts.training.model.StockPrice;

@RepositoryRestResource(path = "stockprices", collectionResourceRel = "stockpricess")
public interface StockPriceRestResource extends PagingAndSortingRepository<StockPrice, Integer> {

}
