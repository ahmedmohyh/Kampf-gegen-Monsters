package com.company;



public class player {
    private double life;
    private double mana;
    private double Erfahrung;
public player(double x, double y){
    Erfahrung = 0;
    life=   x;
    mana  = y;
}
public player(){
    Erfahrung = 0;
    life = 100;
    mana = 35;
}
    public void setLife(double life) {
        this.life = life;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getLife() {
        return life;
    }

    public double getMana() {
        return mana;
    }

    public void setErfahrung(double erfahrung) {
        Erfahrung = erfahrung;
    }

    public double getErfahrung() {
        return Erfahrung;
    }
    public void increase_life(){
    life +=10;
    }
    public void increase_mana(){
    mana+=5;
    }
    public void decrease_mana(){
    mana -=10;
    }
    public void increase_erfahrung(){
    Erfahrung +=8;
    }
    public void set_damage(double dam){
        life -= dam;
    }
}
