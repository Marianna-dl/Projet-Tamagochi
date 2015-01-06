package org.gradle;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Menu m= new Menu();
		Familier familier;
		Scanner sc = new Scanner(System.in);
		
		m.menuCreation();
		m.demanderNom();
		String nom=sc.nextLine();
		m.demanderType();
		
		int choix=sc.nextInt();
		
		if (choix==1){
			familier=new Robot(nom);
		}
		else{
			familier=new Dragon(nom);			
		}

		do{
		m.affichageChoix(choix, nom);
		
		m.ChoixTacheFamilier();
		Scanner scan = new Scanner(System.in);
		int choice=scan.nextInt();	

		if (choice==1){
			familier.nourrir();
		}
		else if(choice==2){
			System.out.println("Familier vie: "+familier.verifierEtat());
		}
		else if(choice==0){
			System.exit(0);
		}
		familier.perdreVie();
		}while(familier.verifierEtat() <0);

	}

}
