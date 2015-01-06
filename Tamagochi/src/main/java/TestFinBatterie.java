package org.gradle;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestFinBatterie {
	@Test
    public void createFinBatterie() {
    	ComportementMourir c = new FinBatterie();
    	System.out.println(c.mort());
	       
    }
}