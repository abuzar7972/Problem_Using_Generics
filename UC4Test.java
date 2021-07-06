package com.bl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UC4Test {
	@Test  
    public void testFindMax(){  
        assertEquals(4,UC4.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,UC4.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
}
