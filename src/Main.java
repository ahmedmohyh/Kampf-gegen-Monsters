package com.company;
import java.security.Permission;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Do you want to fight? (y/n)");
        Scanner input = new Scanner(System.in);
char wahl = input.next().charAt(0);
if (wahl =='y'){
BattleArena b1 = new BattleArena();
player p1 = new player(10,10);
Monster m1 = new Monster(8);
b1.fight(p1,m1);
}
else {
    System.out.println("Thanks for your time");
    return;
}
    }
}
