package praktikum.pbo;

import java.lang.Math;

public class Magician extends Character {

    private int defense;
    private int attack;
    private int hp;

    Magician(int defense, int attack, int hp){
        super(defense, attack, hp);
        this.defense = defense;
        this.attack = attack;
        this.hp = hp;
    }

    @Override
    public boolean attack() {
        double hitChance =  Math.random();
        if (hitChance < 0.35){
            return true;
        }
        return false;
    }
}
