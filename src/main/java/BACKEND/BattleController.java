/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dhiys
 */
public class BattleController {

    private static Character activeChar;

    //need to balance
//    private static int enemyHealth = 30;
    private static boolean isEnemyTurn;
    private static boolean isDead;
    private static String enemyTarget;
    private static int enemyTargetPos;
    private static int enemyDmg;

    private static Enemy activeEnemy;
    private static final Enemy[] enemies = new Enemy[100];

    private static void populateEnemies() {
        //create the character array
        int enemySize = 0;
        File enemiesTxt = new File("Data\\Enemies.txt");
        Scanner fileSc;
        try {
            fileSc = new Scanner(enemiesTxt);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");

                String enemyName = lineSc.next();
                int health = lineSc.nextInt();
                int maxDmg = lineSc.nextInt();
                int minDmg = lineSc.nextInt();

                Enemy nextEnemy = new Enemy(enemyName, health, maxDmg, minDmg);
                enemies[enemySize] = nextEnemy;
                System.out.println("size: " + enemySize + "enemy: " + enemies[enemySize].getName());
                enemySize++;

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(BattleController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void generateRandEnemy() {
        populateEnemies();
        int max = 2;
        int min = 0;
        int posOfEnemy = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("pos of enemy: " + posOfEnemy);
        activeEnemy = enemies[posOfEnemy];
        System.out.println("active enemy: has been set to " + activeEnemy.getName());
    }

    public static void setActiveChar(Character activeChar) {
        BattleController.activeChar = activeChar;
    }

    public static Character getActiveChar() {
        return activeChar;
    }

    public static Enemy getActiveEnemy() {
        return activeEnemy;
    }

    public static boolean isEnemyTurn() {
        return isEnemyTurn;
    }

    public static boolean hasEnoughDice(int neededDice, String elementOfAttack) {
        return DiceAndHandManager.getNumElements(elementOfAttack) >= neededDice;
    }

    public static boolean hasEnoughDice(int neededDice) {
        return DiceAndHandManager.getDiceSize() >= neededDice;
    }

    public static void subtractDice(int attackCost, String elemOfAttack) {
        DiceAndHandManager.useUpDice(elemOfAttack, attackCost);
    }

    public static void playCard(String cardName) {
        SpecialCardsEffects.playCardEffect(ViewingManager.returnCard(cardName));
        DiceAndHandManager.useUpSpecialCard(cardName);

    }

    public static void setEnemyHealth(int amountToSet) {
        activeEnemy.setHealth(amountToSet);
    }

    public static void doEnemyTurn() {
        int max = 2;
        int min = 0;
        int maxDmg = activeEnemy.getMaxDmg();
        int minDmg = activeEnemy.getMinDmg();

        enemyTargetPos = (int) (Math.random() * (max - min + 1) + min);

        enemyDmg = (int) (Math.random() * (maxDmg - minDmg + 1) + minDmg);
        Character charToAttack = ViewingManager.returnCharacter(enemyTargetPos);
        enemyTarget = charToAttack.getName();
        charToAttack.setHp(charToAttack.getHp() - enemyDmg);
    }

    public static boolean isDead() {
        isDead = false;
        if (ViewingManager.returnCharacter(enemyTarget).getHp() <= 0) {
            isDead = true;
            DeckManager.deleteCharacter(enemyTargetPos);
        }

        return isDead;

    }

    public static int getEnemyDmg() {
        return enemyDmg;
    }

    public static String getEnemyTarget() {
        return enemyTarget;
    }

    public static String getEnemyUrl() {
        String imagePath;
        String userHome = System.getProperty("user.home");
        if (activeEnemy.getName().equals("Fatui Agent")) {

            // make image file path
            imagePath = userHome + File.separator + "Documents" + File.separator + "NetBeansProjects" + File.separator + "DhiyaPAT2023" + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "images" + File.separator + "fatuiAgent.png";
        } else if (activeEnemy.getName().equals("Mirror Maiden")) {
            imagePath = userHome + File.separator + "Documents" + File.separator + "NetBeansProjects" + File.separator + "DhiyaPAT2023" + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "images" + File.separator + "mirrorMaiden.png";
        } else {
            imagePath = imagePath = userHome + File.separator + "Documents" + File.separator + "NetBeansProjects" + File.separator + "DhiyaPAT2023" + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "images" + File.separator + "abyssMage.png";
        }
        return imagePath;
    }

}
