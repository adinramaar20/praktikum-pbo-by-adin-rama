package praktikum.pbo;

public class Titan extends Character {

    private int defense;
    private int attack;
    private int hp;

    Titan(int defense, int attack, int hp){
        super(defense, attack, hp);
        this.defense = defense;
        this.attack = attack;
        this.hp = hp;
    }

    @Override
    public boolean attack() {
        double hitChance =  Math.random();
        if (hitChance < 0.4){
            return true;
        }
        return false;
    }
}
