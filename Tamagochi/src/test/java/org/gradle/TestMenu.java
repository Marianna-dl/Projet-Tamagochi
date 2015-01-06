package org.gradle;

import java.util.Scanner;

import org.junit.Test;

public class TestMenu {
	 @Test
	//public static void main (String [] agrs){
	public void canConstructAPersonWithAName() {
		
		int choice;
		
		Menu m=new Menu();

		Scanner sc = new Scanner(System.in);
		
		m.menuCreation();
		m.demanderNom();
		String nom=sc.nextLine();
		m.demanderType();
		int choix=sc.nextInt();
		m.affichageChoix(choix, nom);
		

		m.ChoixTacheFamilier();
		Scanner scan = new Scanner(System.in);
		choice=scan.nextInt();	
		
		
		while(choice!=1 ||choice!=2 ||choice!=3 ||choice!=0 ){
			m.ChoixTacheFamilier();
			choice=scan.nextInt();
		}

		
		
	}

}
