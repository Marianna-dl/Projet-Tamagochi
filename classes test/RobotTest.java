package org.gradle;

import org.junit.Test;

public class RobotTest {
    @Test
    public void creationRobot() {
    	Familier robot=new Dragon("Robot");
    	System.out.println(robot.getName());
    	robot.setComportement(new FinBatterie());
    	robot.executeMort();
    	robot.perdreVie();
    	System.out.println("vie familier "+robot.verifierEtat());
    	robot.nourrir();
    	System.out.println("vie familier "+robot.verifierEtat());
    	robot.setComportement(new Fatigue());
    	robot.executeMort();  
    }
}
