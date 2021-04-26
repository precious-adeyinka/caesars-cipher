/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesars.cipher;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author precious adeyinka
 */
public class CaesarsCipherTest {
    
    public CaesarsCipherTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cipher method, of class CaesarsCipher.
     */
    @Test
    public void testCipher() {
        System.out.println("cipher");
        String message = "how are you doing today";
        int offset = 12;
        CaesarsCipher instance = new CaesarsCipher();
        String expResult = "tai mdq kag pauzs fapmk";
        String result = instance.cipher(message, offset);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
     /**
     * Test of cipher method, of class CaesarsCipher.
     */
    @Test
    public void testCipherByEmptyString () {
        System.out.println("cipher");
        String message = "";
        int offset = 12;
        CaesarsCipher instance = new CaesarsCipher();
        String expResult = "";
        String result = instance.cipher(message, offset);
        assertEquals(expResult, result);
    }

    /**
     * Test of offsetBy method, of class CaesarsCipher.
     */
//    @Test
//    public void testOffsetBy() {
//        System.out.println("offsetBy");
//        char[] character = null;
//        int offset = 0;
//        CaesarsCipher instance = new CaesarsCipher();
//        instance.offsetBy(character, offset);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of offsetChar method, of class CaesarsCipher.
     */
//    @Test
//    public void testOffsetChar() {
//        System.out.println("offsetChar");
//        char c = ' ';
//        int offset = 0;
//        char letterA = ' ';
//        char letterZ = ' ';
//        CaesarsCipher instance = new CaesarsCipher();
//        char expResult = ' ';
//        char result = instance.offsetChar(c, offset, letterA, letterZ);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
