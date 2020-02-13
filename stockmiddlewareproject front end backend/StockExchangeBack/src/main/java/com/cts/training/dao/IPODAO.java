package com.cts.training.dao;

import java.util.List;

import com.cts.training.bean.Company;
import com.cts.training.bean.IPO;

public interface IPODAO {
	
	public boolean saveIPO(IPO ipo);
	
	public boolean updateIPO(IPO ipo);
	
	
	public boolean saveOrUpdateIpo(IPO ipo);
	public boolean removeIPO(IPO ipo);
	
	public IPO getIPOById(int id);
	
	public List<IPO> getAllIPOs();

}
