package com.company;

import java.util.Scanner;

public class BattleArena {
public void fight(player p , Monster m){
    Scanner input = new Scanner(System.in);
    int in = 0;
    boolean flag = false;
    while (!flag){
for (int i =0 ; i<20; i++){
    System.out.print("#");
    if (i==10)
        System.out.print(" New Round ");
}
System.out.println("");
System.out.printf("Your life is  %f\n",p.getLife());
System.out.printf("Your Mana is %f\n",p.getMana());
System.out.printf("The Monster life is %f\n",m.getLif());
System.out.println("It is your turn . Which attack do you want to perform?");
System.out.println("Melee Attack with Sword . Deals 7 to 9 Damage ( 1 )");
System.out.println("Magic Spell  called Fire Ball. costs 10 Mana and deals 1 t o 18 Damage ( 2 )");
in = input.nextInt();
if (in == 1) {
WeaponAttack w1 = new WeaponAttack("Sword",7,9);
System.out.printf("Monster got %f  damage.\n",w1.get_damage());
System.out.println("Monster Attacks!");
MonsterAttacck ma = new MonsterAttacck();
System.out.printf("You got a damage of %f .\n",ma.get_damage());
p.set_damage(ma.get_damage());
m.set_damage(w1.get_damage());

}
else if(in==2) {

    if (p.getMana()>=10) {
        SpellAttack sp = new SpellAttack("Fire ball", 1, 18);
        System.out.printf("Monster got %f  damage.\n", sp.get_damage());
        System.out.println("Monster Attacks!");
        MonsterAttacck ma = new MonsterAttacck();
        System.out.printf("You got a damage of %f .\n", ma.get_damage());
        p.decrease_mana();
        p.set_damage(ma.get_damage());
        m.set_damage(sp.get_damage());
    }
    else {
        System.out.println("You don't have enough Mana");
        if (p.getErfahrung()>=20){
            System.out.println("You can change you points to get Mana if accepted press 1");
            int inside = input.nextInt();
            if (inside ==1) p.increase_mana();


        }
    }

}
if (m.getLif()<0) {System.out.println("You Won");
return;
}
else if (p.getLife()<0) {
    System.out.println("You lost");
return;
}

    }




}


}
