package com.app.dca.service;

import java.util.List;

import com.app.dca.entity.Userdeveloper;


public interface IUserService {

	Userdeveloper login(Userdeveloper user);
	
	Userdeveloper logout(Userdeveloper user);
    List<Userdeveloper> getAllUsers();
}
