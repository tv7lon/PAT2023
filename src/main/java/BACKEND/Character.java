/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND;

/**
 *
 * @author dhiys
 */
public class Character {

    //things everyone will have
    private String name;
    private String elementType;
    private String weaponType;
    private int physDmg;
    private int skillDmg;
    private int burstDmg;
    private String lore;
    private int hp;

    private int physCost = 2;
    private int skillCost = 3;
    private int burstCost = 5;

    public Character(String name, String elementType, String weaponType, int physDmg, int skillDmg, int burstDmg, String lore) {
        this.hp = 15;
        this.name = name;
        this.elementType = elementType;
        this.weaponType = weaponType;
        this.physDmg = physDmg;
        this.skillDmg = skillDmg;
        this.burstDmg = burstDmg;
        this.lore = lore;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getElementType() {
        return elementType;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public int getPhysDmg() {
        return physDmg;
    }

    public int getSkillDmg() {
        return skillDmg;
    }

    public int getBurstDmg() {
        return burstDmg;
    }

    public String getLore() {
        return lore;
    }

    @Override
    public String toString() {
        return name + "#" + elementType + "#" + weaponType + "#" + physDmg + "#" + skillDmg + "#" + burstDmg + "#" + lore;
    }

    public int getBurstCost() {
        return burstCost;
    }

    public int getPhysCost() {
        return physCost;
    }

    public int getSkillCost() {
        return skillCost;
    }

    public void setPhysDmg(int physDmg) {
        this.physDmg = physDmg;
    }

    public void setSkillDmg(int skillDmg) {
        this.skillDmg = skillDmg;
    }

    public void setBurstDmg(int burstDmg) {
        this.burstDmg = burstDmg;
    }

    public void setBurstCost(int burstCost) {
        this.burstCost = burstCost;
    }

    public void setPhysCost(int physCost) {
        this.physCost = physCost;
    }

    public void setSkillCost(int skillCost) {
        this.skillCost = skillCost;
    }

}
