/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.execption;

/**
 *
 * @author Asus
 */
public class Healer extends Character {

    private int defense;
    private int attack;
    private int hp;

    Healer(int defense, int attack, int hp){
        super(defense, attack, hp);
        this.defense = defense;
        this.attack = attack;
        this.hp = hp;
    }

    @Override
    public boolean attack() {
        double hitChance =  Math.random();
        if (hitChance < 0.85){
            return true;
        }
        return false;
    }

    public void heal(){
        System.out.println("Menggunakan skill heal");
    }

    public int getHp(){
        return this.hp + 25;
    }

    public void setHp(int hp){
        System.out.println(this.hp);
    }
}
