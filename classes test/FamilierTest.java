package org.gradle;

import org.junit.Test;

import static org.junit.Assert.*;

public class FamilierTest {
    @Test
    public void creerFamilier() {
    	Familier familier=new Familier("Test");
    	System.out.println(familier.getName());
    	familier.setComportement(new FinBatterie());
    	familier.executeMort();
    	familier.perdreVie();
    	familier.nourrir();
    	System.out.println("vie familier "+familier.verifierEtat());
    	familier.setComportement(new Fatigue());
    	familier.executeMort();   
    }
}
