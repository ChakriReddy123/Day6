package com.day6;

import java.util.*;


public class UserService
{
    public boolean validateUser(String uname, String pass)
    {
        if(UserRepo.getUsers().containsKey(uname))
        {
            if(UserRepo.getUsers().get(uname).equals(pass))
                return true;
            else
                return false;
        }
        else {
        	return false;
        }
    }
    public void addUser(String uname, String pass)
    {
        if(UserRepo.getUsers().containsKey(uname))
            System.out.println("User is Available");
        else {
            UserRepo.getUsers().put(uname,pass);
            System.out.println("User Added");
        }
    }
	public void getDetails() {
		System.out.println(UserRepo.getUsers());
		
	}
}
 