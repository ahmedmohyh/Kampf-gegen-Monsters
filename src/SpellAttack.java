package com.company;

public class SpellAttack implements Attack {
    private String name;
    private double mindamage;
    private double maxdamage;
    private double actual_damage;
    private double mana_needed;

    public SpellAttack(String S, double x, double y) {
        name = S;
        mindamage = x;
        maxdamage = y;
        double avg = (maxdamage+mindamage)/2;
        actual_damage = Math.random() * avg*2;
        actual_damage  = Math.round(actual_damage * 10) / 10.0;
        mana_needed =10;
    }
    public void setActual_damage(){
        actual_damage = Math.random() * 20;
        actual_damage = Math.round(actual_damage * 10) / 10.0;
    }

    public SpellAttack() {
        name = "Fire ball";
        mindamage = 1;
        maxdamage = 20;
        actual_damage = Math.random() * 20;
        actual_damage = Math.round(actual_damage * 10) / 10.0;
        mana_needed = 10;
    }

    public String getdescription() {
        return name;
    }

    public double get_damage() {

        return actual_damage;
    }

    public double getMana_needed() {
        return mana_needed;
    }
}