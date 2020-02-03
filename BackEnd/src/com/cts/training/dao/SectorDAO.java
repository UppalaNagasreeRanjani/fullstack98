package com.cts.training.dao;

import java.util.List;

import com.cts.training.model.Sector;

public interface SectorDAO {

	public boolean saveSector(Sector sector);

	public boolean updateSector(Sector sector );
   public Sector getSectorById(int id);
	public List<Sector> getAllSector();

}
