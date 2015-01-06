package org.gradle;

import java.util.Scanner;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestComportement {	
	@Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Dragon");
    	assertEquals("Dragon", person.getName());
    	//verifEtat();
        int vieMort=0;
        int vieDanger=10;
        if (vieMort==0){
        	String n=person.getName();
        	System.out.println(n+person.exeMort());
        }
        
        if (vieDanger<=10){
        	System.out.println(person.getName()+" s'épuise\nVoulez-vous le nourrir?\n" +
        			"Répondre avec 1 pour oui : ");
        	Scanner sc = new Scanner(System.in);
        	int reponse = sc.nextInt();
        	if(reponse==1){
        		String n=person.getName();
        		//getType();
        		if(n=="Robot"){
        			//getName();
        			System.out.println("Votre familier est branché sur le secteur");
        			
        		}else if(n=="Dragon"){
        			System.out.println("Votre familier a mangé des moutons");
        		}
        		//person.nourri();
        	}
        }
        
    }
        

	
}
