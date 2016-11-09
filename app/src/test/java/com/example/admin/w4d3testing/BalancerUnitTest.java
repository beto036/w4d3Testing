package com.example.admin.w4d3testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by admin on 11/9/2016.
 */

public class BalancerUnitTest {
    Balancer balancer;

    @Before
    public void setUp(){
        balancer = new Balancer();
    }

    @Test
    public void blanacerIsCorrect(){
        assertTrue(balancer.isBalanced("{}()"));
        assertTrue(balancer.isBalanced("[{()}]"));
        assertTrue(balancer.isBalanced("({()})"));
    }

    @Test
    public void blanacerIsNotCorrect(){
        assertFalse(balancer.isBalanced("[["));
        assertFalse(balancer.isBalanced("{}("));
    }

    @After
    public void cleanUp(){
        balancer = null;
    }
}
