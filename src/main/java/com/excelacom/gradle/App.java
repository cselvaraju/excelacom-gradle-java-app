package com.excelacom.gradle;

/**
 *
 * 
 */
public class App
{
    public static void main(String[] args)
    {

	RandomGenerator aRandomGenerator = new DefaultRandomGenerator();
	System.out.println("The number is :" + aRandomGenerator.generate());

    }
}
