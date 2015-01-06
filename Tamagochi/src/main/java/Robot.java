package org.gradle;

public class Robot extends Familier{
	
	public Robot(String nom){
		super(nom);
		setComportement(new FinBatterie());
	}

}
