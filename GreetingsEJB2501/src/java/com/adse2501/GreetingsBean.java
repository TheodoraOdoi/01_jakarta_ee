package com.adse2501;

import jakarta.ejb.Stateless;
import jakarta.ejb.LocalBean;

/**
 *
 * @author user
 */
@Stateless
@LocalBean
public class GreetingsBean implements GreetingsRemote
{

    @Override
    public void sayHello(String username)
    {
        System.out.println("Hello " + username + "!");
    }
    
}
