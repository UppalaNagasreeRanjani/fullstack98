package com.cts.training.InitialPublicOfferingservice;

import java.util.List;

//import com.cts.training.model.Company;
//import com.cts.training.model.InitialPublicOffering;

public interface InitialPublicofferingService {
	public InitialPublicOffering insert(InitialPublicOffering initialpublicoffering);
	public void deleteById(int id);
	public InitialPublicOffering update(InitialPublicOffering initialpublicofferings);
	public List<InitialPublicOffering> getAllInitialPublicOfferings();
	public InitialPublicOffering getElementById(int id);
}
