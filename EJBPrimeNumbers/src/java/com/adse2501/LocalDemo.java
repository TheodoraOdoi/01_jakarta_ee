package com.adse2501;

import jakarta.ejb.Stateless;

/**
 *
 * @author user
 */
@Stateless
public class LocalDemo implements LocalDemoLocal
{

    @Override
    public void prime()
    {
        int n ;
        int number ;
        String primeNumbers = "";
        for (n = 0; n <=100; n++)
        {
            int primeCounter = 0;
            for(number = 1; number <= n; number++)
            {
                if (n % number == 0)
                {
                    primeCounter += 1;
                }
                  
            }
            if (primeCounter == 2)
                    primeNumbers += n + " ";
        }
       
        
        System.out.println("Prime numbers from 1 to 100 are:\n" + primeNumbers);
        
    }
}