/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.bme.demarci.mastermind.logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marcell
 */
public class SecretTest {
    
    public SecretTest() {
    }

    @Test
    public void testCheck() {
        System.out.println("check");
        int pos = 0;
        Dot value = null;
        Secret instance = null;
        boolean expResult = false;
        boolean result = instance.check(pos, value);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testLength() {
        System.out.println("length");
        Secret instance = null;
        int expResult = 0;
        int result = instance.length();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
