package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    private final String name;
    private ComportementMourir comp;

    public Person(String name) {
        this.name = name;
        if (name=="Robot"){
        	this.comp=new FinBatterie();
        }else{
        	this.comp=new Fatigue();
        }
        new GrowthList();
    }

    public String getName() {
        return name;
    }
    
    public ComportementMourir getComp() {
        return this.comp;
    }
    
    public void exeMort(){
    	this.comp.mort();
    }
}
