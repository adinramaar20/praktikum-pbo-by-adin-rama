package praktikum.pbo;

public abstract class Character {

    private int defense;
    private int attack;
    private int hp;

    Character(int defense,int attack,int hp){
        this.defense = defense;
        this.attack = attack;
        this.hp = hp;
    }

    public abstract boolean attack();

    public void receiveDamage(int damage){
        if (damage > this.defense){
            this.hp = (this.hp + defense) - damage;
            if(this.hp <= 0){
                this.hp = 0;
            }
        }
    }

    public void info(){
        System.out.println("============= STATUS =============");
        System.out.println("ROLE\t: " + getClass().getSimpleName());
        System.out.println("HP\t\t: " + getHp());
        System.out.println("ATTACK\t: " + getAttack());
        System.out.println("DEFENSE\t: " + getDefense());
    }

    public int getDefense() {
        return this.defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHp() {
        return this.hp + this.getDefense();
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
