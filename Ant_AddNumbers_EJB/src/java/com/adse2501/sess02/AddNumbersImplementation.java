package com.adse2501.sess02;

import jakarta.ejb.Stateful;

/**
 *
 * @author user
 */
@Stateful
public class AddNumbersImplementation implements AddNumbers
{

    @Override
    public int addNums(int num1, int num2)
    {
        return num1 + num2;
    }

    
}
