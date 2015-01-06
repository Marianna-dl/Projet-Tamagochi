package org.gradle;

public class Menu {
	
	public Menu(){}

	public void menuCreation(){
		
		 System.out.println("##############-MENU-################# \n" +
				  			"       -Creation de votre Familier-   \n" );

	}
	
	public void demanderNom(){
		System.out.println("-Quelle nom voulez vous donner a votre Familier?-");
		
	}

	public void demanderType(){
		System.out.println("-Quelle type de Familier voulez vous?- \n" +
				"[1]-Robot \n" +
				"[2]-Dragon");
			
		}
	public void affichageChoix(int choice,String nom){
	
		if (choice==1){
			System.out.println("Votre Familier--> Nom:"+ nom +" Type: ROBOT");
		}
		else if (choice==2){
			System.out.println("Votre Familier--> Nom:"+ nom +" Type: DRAGON");	
		}
			
	}
		
		
	public void ChoixTacheFamilier(){
		
		 System.out.println("\n##############-MENU-################# \n" +
		 					"		[1]-Nourrir \n" +
		 					"		[2]-Consulter Etat \n" +
		 					"		[3]-Ne rien faire \n" +
		 					"		[0]-Quitter \n" );
		
	}
}
