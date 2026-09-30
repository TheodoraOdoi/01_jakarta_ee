package com.adse2501;

import jakarta.ejb.Remote;

/**
 *
 * @author user
 */
@Remote
public interface GreetingsRemote
{
    void sayHello(String username);
}
