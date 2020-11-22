package com.company;

public class MonsterAttacck implements Attack {
    private String name;
    private double damage;
    public MonsterAttacck(){
        name="Monster fire";
        damage = Math.random()*20;
        damage = Math.round(damage * 10) / 10.0;
    }
    public String  getdescription(){
        return name ;
    }
    public double get_damage(){
        return damage;
    }
    public void setDamage(){
        damage = Math.random()*13;
        damage = Math.round(damage * 10) / 10.0;
    }
}
