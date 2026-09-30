package com.adse2501.client;

import com.adse2501.GreetingsBean;
import com.adse2501.GreetingsRemote;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Create a GreetingsRemote object
        GreetingsRemote greetings = new GreetingsBean();
        
        System.out.println("Please enter your name");
        String name = new Scanner(System.in).nextLine();
        
        greetings.sayHello(name);
    }
    
}
