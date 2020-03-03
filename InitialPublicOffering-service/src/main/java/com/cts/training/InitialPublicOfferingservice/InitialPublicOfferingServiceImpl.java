package com.cts.training.InitialPublicOfferingservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

//import com.cts.training.dao.CompanyDAO;
//import com.cts.training.dao.InitialPublicOfferingDAO;
//import com.cts.training.model.InitialPublicOffering;
////import com.cts.training.service.InitialPublicoffering;
//import com.cts.training.service.InitialPublicofferingService;

public class InitialPublicOfferingServiceImpl implements InitialPublicofferingService{
	@Autowired
	InitialPublicOfferingDAO initialpublicofferingDAO;
	@Override
	public InitialPublicOffering insert(InitialPublicOffering initialpublicoffering) {
		InitialPublicOffering saveinitialpublicoffering = initialpublicofferingDAO.save(initialpublicoffering);
		return saveinitialpublicoffering;
	}
	@Override
	public InitialPublicOffering update(InitialPublicOffering initialpublicoffering) {
		InitialPublicOffering initialpublicofferingupdate = initialpublicofferingDAO.save(initialpublicoffering);
		return initialpublicofferingupdate;
	}
	@Override
	public void deleteById(int id) {
		initialpublicofferingDAO.deleteById(id);
	}
	@Override
	public InitialPublicOffering getElementById(int id) {
		Optional<InitialPublicOffering> initialpublicoffering = initialpublicofferingDAO.findById(id);
		InitialPublicOffering initialpublicofferingid = initialpublicoffering.get();
		return initialpublicofferingid;
	}
	@Override
	public List<InitialPublicOffering> getAllInitialPublicOfferings() {
		return initialpublicofferingDAO.findAll();
	}
}
