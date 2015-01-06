package org.gradle;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DragonTest {
    @Test
    public void creationDragon() {
    	Familier dragon=new Dragon("Dragon");
    	System.out.println(dragon.getName());
    	dragon.setComportement(new FinBatterie());
    	dragon.executeMort();
    	dragon.perdreVie();
    	System.out.println("vie familier "+dragon.verifierEtat());
    	dragon.nourrir();
    	System.out.println("vie familier "+dragon.verifierEtat());
    	dragon.setComportement(new Fatigue());
    	dragon.executeMort();  
    }
}
