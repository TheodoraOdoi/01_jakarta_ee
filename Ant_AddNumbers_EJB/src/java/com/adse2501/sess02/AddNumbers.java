package com.adse2501.sess02;

import jakarta.ejb.Local;

/**
 *
 * @author user
 */
@Local
public interface AddNumbers
{
    int addNums(int num1, int num2);
}
