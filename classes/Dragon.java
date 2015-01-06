package org.gradle;

public class Dragon extends Familier{
	public Dragon(String nom){
		super(nom);
		setComportement(new Fatigue());
	}
	
	
}