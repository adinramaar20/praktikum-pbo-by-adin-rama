package praktikum.pbo;

public class Warrior extends Character {

    private int defense;
    private int attack;
    private int hp;

    Warrior(int defense, int attack, int hp){
        super(defense, attack, hp);
        this.defense = defense;
        this.attack = attack;
        this.hp = hp;
    }

    @Override
    public boolean attack() {
        double hitChance =  Math.random();
        if (hitChance < 0.6){
            return true;
        }
        return false;
    }
}
