package com.cts.training.dao;

import java.util.List;

<<<<<<< HEAD


=======
>>>>>>> a989096df1d0e7357435777c29455996cbf612bc
import com.cts.training.model.Ipo;

public interface IpoDAO {
	public boolean saveIpo(Ipo ipo);

	public boolean updateIpo(Ipo ipo );
   public Ipo getIpoById(int id);
	public List<Ipo> getAllIpo();

}
