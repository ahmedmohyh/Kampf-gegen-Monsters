package com.company;

public class Monster {
    private double lif;
public Monster(double x){
    lif =x;
}
    public void setLif(double life) {
        lif = life;
    }
    public void set_damage(double dam){
        lif -= dam;
    }

    public double getLif() {
        return lif;
    }
}
