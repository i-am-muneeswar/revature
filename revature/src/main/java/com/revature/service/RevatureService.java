package com.revature.service;

import com.revature.dao.RevatureDAO;
import com.revature.dao.RevatureDAOInterface;
import com.revature.entity.RevatureUser;

public class RevatureService implements RevatureServiceInterface {

	public int createRevatureService(RevatureUser ru) {
		
		RevatureDAOInterface rd = new RevatureDAO();
		int i = rd.createProfileDAO(ru);
		return i;
		
	}

	public RevatureUser viewRevatureService(RevatureUser ru) {
		
		RevatureDAOInterface rd = new RevatureDAO();
		RevatureUser i = rd.viewProfileDAO(ru);
		return i;
		
	}

}
