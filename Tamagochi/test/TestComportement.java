package org.gradle;

import java.util.Scanner;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestComportement {	
	@Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Robot");
    	assertEquals("Robot", person.getName());
        int vieMort=0;
        int vieDanger=10;
        if (vieDanger<=10){
        	System.out.println(person.getName()+" s'épuise\nVoulez-vous le nourrir?\n" +
        			"Répondre avec 1 pour oui : ");
        	Scanner sc = new Scanner(System.in);
        	int reponse = sc.nextInt();
        	if(reponse==1){
        		System.out.println("Votre familier est nourri");
        	}
        }
        if (vieMort==0){
        	assertEquals("Robot", person.getName());
        	String n=person.getName();
        	person.exeMort();
        }
    }
        

	
}
