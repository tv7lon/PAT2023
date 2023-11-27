/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND;

/**
 *
 * @author dhiys
 */
public class Enemy {

    private String name;
    private int health;
    private final int maxDmg;
    private final int minDmg;

    public Enemy(String name, int health, int maxDmg, int minDmg) {
        this.name = name;
        this.health = health;
        this.maxDmg = maxDmg;
        this.minDmg = minDmg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxDmg() {
        return maxDmg;
    }

    public int getMinDmg() {
        return minDmg;
    }

}
