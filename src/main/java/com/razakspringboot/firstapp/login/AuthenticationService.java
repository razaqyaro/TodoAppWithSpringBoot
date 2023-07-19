package com.razakspringboot.firstapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService
{
    public boolean authenticate(String username, String password)
    {
        boolean isValidUserName = username.equalsIgnoreCase("razzy@Dollar");
        boolean isValidPassword = password.equalsIgnoreCase("0241019797");

        return isValidUserName && isValidPassword;

    }
}
