package com.company;
import java.lang.Math;
public class WeaponAttack implements Attack {
    private String name;
    private double mindamage;
    private double maxdamage;
    private double actual_damage;

    public WeaponAttack(String S, double x, double y) {
        name = S;
        mindamage = x;
        maxdamage = y;
            double avg = (maxdamage + mindamage) / 2;
            actual_damage = Math.random() * avg;
            actual_damage = Math.round(actual_damage * 10) / 10.0;


    }

    public void setActual_damage() {
        actual_damage = Math.random() * 10;
       actual_damage=  Math.round(actual_damage * 10) / 10.0;
    }

    public WeaponAttack() {
        name = "Sword";
        mindamage = 1;
        maxdamage = 10;
        actual_damage = Math.random() * 10;
        actual_damage=  Math.round(actual_damage * 10) / 10.0;
    }

    public String getdescription() {
        return name;
    }

    public double get_damage() {

        return actual_damage;
    }
}
