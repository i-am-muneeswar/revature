package com.revature.dao;

import com.revature.entity.RevatureUser;

public interface RevatureDAOInterface {

	int createProfileDAO(RevatureUser ru);

	RevatureUser viewProfileDAO(RevatureUser ru);

}
