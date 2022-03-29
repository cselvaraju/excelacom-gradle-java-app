package com.excelacom.gradle;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.excelacom.gradle.DefaultRandomGenerator;
import com.excelacom.gradle.RandomGenerator;

/**
 * Unit test for simple App.
 */
public class RandomGeneratorTest
{

    private RandomGenerator randomGenerator;

    @Before
    public void setUp()
    {
	randomGenerator = new DefaultRandomGenerator();
    }

    @After
    public void after()
    {
	randomGenerator = null;
    }

    @Test
    public void testName()
    {
	Assert.assertSame("Name is not the same as expected: ", "Default Randon Number Generator", randomGenerator.name());
    }

    @Test
    public void testRandomGenerator()
    {
	int generatedInt = randomGenerator.generate();
	assertTrue("Generated int was not between 1 and 10: ", generatedInt >= 1 && generatedInt <= 10);
    }

}
