package com.cts.training.dao;

import java.util.List;



import com.cts.training.model.Ipo;

public interface IpoDAO {
	public boolean saveIpo(Ipo ipo);

	public boolean updateIpo(Ipo ipo );
   public Ipo getIpoById(int id);
	public List<Ipo> getAllIpo();

}
