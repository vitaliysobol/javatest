package com.wix;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ForTestingTest {
    @Test
    public void addStringsTest(){
        ForTesting forTestingObject = new ForTesting();

        String result = forTestingObject.addStrings("test1string","test2string");

        assertEquals("test1stringtest2string", result);
    }

}