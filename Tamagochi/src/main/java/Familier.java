package org.gradle;

import java.util.Random;

public class Familier {
 private static int VIEMAX=30;
 private int vie;
 private String nom;
 private ComportementMourir comportement;
 public Familier( String noms){
	 this.nom=noms;
	 this.vie=VIEMAX;
 }
 
 
 public int verifierEtat(){
	 return this.vie;
 }
 
 public int perdreVie(){
		Random r = new Random() ;
    	int indice=r.nextInt(2);
    	return indice;
 }
 public void nourrir(){
	 if (this.vie<VIEMAX)
		{
		 	this.vie+=2;
		}
	 
 }
 
public void executeMort(){
	 this.comportement.mort();
	 
 }

 public void setComportement(ComportementMourir comp){
	 this.comportement=comp;
 }
}
