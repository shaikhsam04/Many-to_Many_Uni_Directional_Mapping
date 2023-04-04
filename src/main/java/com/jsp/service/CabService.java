package com.jsp.service;

import java.util.List;

import com.jsp.dao.CabDao;
import com.jsp.dto.Cab;

public class CabService {
	CabDao cabDao = new CabDao();

	public Cab cerateCab(Cab cab) {
		return cabDao.createCab(cab);
	}

	public Cab getCabById(int id) {
		return cabDao.getCabById(id);
	}

	public Cab deleteCabById(int id) {
		return cabDao.deleteCabByID(id);
	}

	public Cab updateCab(int id, String name, String type) {
		return cabDao.updateCab(id, name, type);
	}

	public List<Cab> readAllCabs() {
		return cabDao.readAllCabs();
	}
}
