package com.prince.cdac.service;

import com.prince.cdac.model.Login;

public interface LoginService {
	
	Login saveUser(Login login);
	Login updateUser(Login login);
	void delUser(Login login);
	Login getUserById(long uId);

}
