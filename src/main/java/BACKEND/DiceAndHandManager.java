/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND;

import java.awt.Color;

/**
 *
 * @author dhiys
 */
public class DiceAndHandManager {

    //DICE ROLLING
    private static String[] dice = new String[100];
    private static int diceSize = 0;
    // private static int activeDiceSize=0;

    private static int[] posToRedo = new int[100];
    private static int posToRedoSize = 0;

    private static boolean wantsReroll = false;
    private static boolean secondRoll = false;

    ////////////////// SPECIAL CARDS ROLLING
    private static Card[] cardsInHand = new Card[100];
    private static int cardsInHandSize = 0;

    private static int numPyroDice;
    private static int numCryoDice;
    private static int numElectroDice;
    private static int numHydroDice;

    public static void useUpDice(String element, int numToRemove) {

        System.out.println("atk cost in use dice meth" + numToRemove);

        for (int diceRemoved = 0; diceRemoved < numToRemove; diceRemoved++) {

            for (int j = 0; j < diceSize; j++) {
                if (dice[j].equals(element)) {

                    dice[j] = "ZZZZZ";
                    sort();
                    diceSize = diceSize - 1;
                    break;
                }
            }
        }

    }

    public static void setDiceSize(int diceSize) {
        DiceAndHandManager.diceSize = diceSize;
    }

    public static void useUpSpecialCard(String cardToUse) {
        cardsInHandSize = cardsInHandSize - 1;
        System.out.println("hand size: " + cardsInHandSize);

    }

    public static int getDiceSize() {
        return diceSize;
    }

    //pyro =1, hyrdro=5
    public static void addDice() {
        int max = 4; //both inclusive
        int min = 1;
        for (int i = 0; i < 8; i++) {
            int randInt = (int) (Math.random() * (max - min + 1) + min);
            System.out.println("rand int: " + randInt);
            if (randInt == 1) {
                dice[diceSize] = "Pyro";
                System.out.println(dice[diceSize]);
                diceSize++;
            } else if (randInt == 2) {
                dice[diceSize] = "Cryo";
                System.out.println(dice[diceSize]);
                diceSize++;
            } else if (randInt == 3) {
                dice[diceSize] = "Electro";
                System.out.println(dice[diceSize]);
                diceSize++;
            } else if (randInt == 4) {
                dice[diceSize] = "Hydro";
                System.out.println(dice[diceSize]);
                diceSize++;
            }
            //System.out.println("ELement: "+ dice[diceSize]);
        }

    }

    public static void setWantsReroll(boolean wantsReroll) {
        DiceAndHandManager.wantsReroll = wantsReroll;
    }

    public static void countElements() {
        numPyroDice = 0;
        numCryoDice = 0;
        numElectroDice = 0;
        numHydroDice = 0;

        for (int i = 0; i < diceSize; i++) {
            if (dice[i].equals("Pyro")) {
                numPyroDice++;
                System.out.println("Counting pyro" + numPyroDice);

            } else if (dice[i].equals("Cryo")) {
                numCryoDice++;
                System.out.println("Counting cryo" + numCryoDice);

            } else if (dice[i].equals("Electro")) {
                numElectroDice++;
                System.out.println("Counting elec" + numElectroDice);

            } else if (dice[i].equals("Hydro")) {
                numHydroDice++;
                System.out.println("Counting hyd" + numHydroDice);
            } else {
                //do nothing
            }
        }
    }

    public static int getNumElements(String elementToCount) {

        if (elementToCount.equals("Pyro")) {
            return numPyroDice;
        } else if (elementToCount.equals("Cryo")) {
            return numCryoDice;
        } else if (elementToCount.equals("Electro")) {
            return numElectroDice;
        } else {
            return numHydroDice;
        }
    }

    public static void setNumPyroDice(int numPyroDice) {
        DiceAndHandManager.numPyroDice = numPyroDice;
    }

    public static void setNumCryoDice(int numCryoDice) {
        DiceAndHandManager.numCryoDice = numCryoDice;
    }

    public static void setNumElectroDice(int numElectroDice) {
        DiceAndHandManager.numElectroDice = numElectroDice;
    }

    public static void setNumHydroDice(int numHydroDice) {
        DiceAndHandManager.numHydroDice = numHydroDice;
    }

    public static boolean cardHandHasDupe() {
        boolean isDupe = false;
        for (int i = 0; i < cardsInHandSize - 1; i++) {
            for (int j = i + 1; j < cardsInHandSize; j++) {
                if ((cardsInHand[i].getName()).equals(cardsInHand[j].getName())) {
                    isDupe = true;
                    break;
                }
            }
        }
        System.out.println("has dupe: " + isDupe);
        return isDupe;
    }

    public static int getCardsInHandSize() {
        return cardsInHandSize;
    }

    public static void addSpecialCards(int max, int min, int numCardsInHand) {
        for (int i = 0; i < numCardsInHand; i++) {
            int randInt = (int) (Math.random() * (max - min + 1) + min);

            cardsInHand[i] = ViewingManager.returnCard(randInt - 1);
            cardsInHandSize++;
            System.out.println("after turn over (carads in hand are): " + cardsInHandSize);
            // System.out.println("Card at position " + i + " in hand is " + cardsInHand[i].getName());
        }
    }

    public static void clearHand() {
        for (int i = 0; i < cardsInHandSize; i++) {
            cardsInHand[i] = null;
        }
        cardsInHandSize = 0;
    }

    public static void clearDice() {
        for (int i = 0; i < diceSize; i++) {
            dice[i] = null;
        }
        diceSize = 0;
    }

    public static Card returnCardInHand(int posToReturn) {
        return cardsInHand[posToReturn];
    }

    public static String getElement(int posToGet) {
        System.out.println("Position at" + posToGet + ": " + dice[posToGet]);
        return dice[posToGet];
    }

    public static Color returnColour(String colourToReturn) {

        Color c = new Color(0, 0, 0);
        if (colourToReturn.equals("Pyro")) {
            c = new Color(224, 126, 52);
            return c;
        } else if (colourToReturn.equals("Cryo")) {
            c = new Color(182, 225, 240);
            return c;
        } else if (colourToReturn.equals("Electro")) {
            c = new Color(131, 71, 191);
            return c;
        } else if (colourToReturn.equals("Hydro")) {
            c = new Color(32, 43, 161);
            return c;
        } else {
            c = new Color(30, 30, 30);
            return c;
        }
    }

    public static void sort() {

        for (int i = 0; i < diceSize - 1; i++) {
            // boolean swapped = false;
            for (int j = 0; j < diceSize - i - 1; j++) {
                if (dice[j].compareTo(dice[j + 1]) > 0) {

                    String temp = dice[j];
                    dice[j] = dice[j + 1];
                    dice[j + 1] = temp;
                    // swapped = true;
                }

            } //if no swaps were made
//            if (!swapped) {
//                break;
//            }
        }
    }

    public static void addToRedo(int posToRedo) {
        DiceAndHandManager.posToRedo[posToRedoSize] = posToRedo;
        posToRedoSize++;
        wantsReroll = true;
    }

//    public static void clearDupeDice() {
//        for (int i = 0; i < posToRedoSize; i++) {
//            dice[posToRedo[i]] = null;
//            diceSize = 8-posToRedoSize;
//
//        }
//    }
    public static void clearPosToReroll() {
        for (int i = 0; i < posToRedoSize; i++) {
            posToRedo[i] = 0;
            System.out.println(posToRedo[i]);
        }
        posToRedoSize = 0;
    }

    public static void setSecondRoll(boolean state) {
        secondRoll = state;
    }

    public static boolean getSecondRoll() {
        return secondRoll;
    }

    public static void rerollPositions() {
        int max = 4;
        int min = 1;

        for (int i = 0; i < posToRedoSize; i++) {
            System.out.println(posToRedo[i]);
            int randInt = (int) (Math.random() * (max - min + 1) + min);
            if (randInt == 1) {
                dice[posToRedo[i]] = "Pyro";
            } else if (randInt == 2) {
                dice[posToRedo[i]] = "Cryo";
            } else if (randInt == 3) {
                dice[posToRedo[i]] = "Electro";
            } else if (randInt == 4) {
                dice[posToRedo[i]] = "Hydro";
            }
        }
    }

    public static boolean hasSelectedToReroll() {
        return wantsReroll;
    }

    public static boolean hasDupeRerollDice() {
        boolean isDupe = false;
        for (int i = 0; i < posToRedoSize - 1; i++) {
            for (int j = i + 1; j < posToRedoSize; j++) {
                if ((posToRedo[i] == (posToRedo[j]))) {
                    isDupe = true;
                    break;
                }
            }
        }
        return isDupe;
    }

}
