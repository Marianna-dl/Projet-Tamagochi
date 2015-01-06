package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestFatique {
	
	@Test
    public void createFatigue() {
    	ComportementMourir c = new Fatigue();
    	System.out.println(c.mort());
	       
    }

}
