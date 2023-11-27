/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dhiys
 */
public class DeckManager {

    public static Character[] characterDeck = new Character[100];
    public static int characterDeckSize;

    public static Card[] cardDeck = new Card[100];
    public static int cardDeckSize;

    //declare at class lvl so they dont get initialized to 0 each
    private static boolean isFullDeck;
    private static boolean hasADeck =false;


    ///////////////////////////////
    public static boolean isFullDeck() {
        isFullDeck = false;
        if (isCompleteCardDeck() && isCompleteCharacterDeck() && !hasDupeCards() && !hasDupeCharacters()) {
            isFullDeck = true;
        }
        return isFullDeck;
    }

    public static boolean getHasADeck() {
        return hasADeck;
    }

    public static void setHasADeck(boolean hasADeck) {
        DeckManager.hasADeck = hasADeck;
    }

    public static boolean isCompleteCharacterDeck() {
        boolean isCompleteDeck = false;
        if (characterDeckSize == 3) {
            isCompleteDeck = true;
        }
        return isCompleteDeck;
    }

    public static boolean isCompleteCardDeck() {
        boolean isCompleteDeck = false;
        if (cardDeckSize == 6) {
            isCompleteDeck = true;
        }
        return isCompleteDeck;
    }

//    public static void removeCharsFromActiveDB() {
//        File f = new File("Data\\CharacterDeck.txt");
//
//        try {
//            FileWriter fw = new FileWriter(f);
//            fw.write("");
//            fw.close();
//
//            //error checking
//            //System.out.println("Successful cleared");
//
//        } catch (IOException ex) {
//            Logger.getLogger(DeckManager.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("ERROR: Could not find file.");
//        }
//        charEntryNum = 0;
//    }

    public static void addCharsToDB() {
        try {
            // Read the existing data from the file
            File f = new File("Data\\CharacterDeck.txt");  
            FileWriter fw = new FileWriter(f);
            
            // Write the updated data back to the file
            for (int i = 0; i < characterDeckSize; i++) {
                fw.write(characterDeck[i].toString()+"\n");
            }
            
            fw.close(); 

            System.out.println("Data written successfully.");
        } catch (IOException ex) {
            Logger.getLogger(StatsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
       public static void addCardsToDB() {
        try {
            // Read the existing data from the file
            File f = new File("Data\\CardDeck.txt");  
            FileWriter fw = new FileWriter(f);
            
            // Write the updated data back to the file
            for (int i = 0; i < cardDeckSize; i++) {
                fw.write(cardDeck[i].toString()+"\n");
            }
            
            fw.close(); 

            System.out.println("Data written successfully.");
        } catch (IOException ex) {
            Logger.getLogger(StatsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void selectCharsFromInfoDB(String charToAdd) {
        try {
            //create the character array
            File charactersTxt = new File("Data\\Characters.txt");
            Scanner fileSc = new Scanner(charactersTxt);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String charName = lineSc.next();
                String elemType = lineSc.next();
                String weaponType = lineSc.next();

                int physDMG = lineSc.nextInt();
                int skillDMG = lineSc.nextInt();
                int burstDMG = lineSc.nextInt();
                String lore = lineSc.next();

                if ((characterDeckSize < 3 && (charName.equals(charToAdd)))) {
                    Character nextCharacter = new Character(charName, elemType, weaponType, physDMG, skillDMG, burstDMG, lore);
                    characterDeck[characterDeckSize] = nextCharacter;
                    characterDeckSize++;
                    //addCharsToActiveDB(nextCharacter.toString());

                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DeckManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean hasDupeCards() {
        boolean isDupe = false;
        for (int i = 0; i < cardDeckSize - 1; i++) {
            for (int j = i + 1; j < cardDeckSize; j++) {
                if ((cardDeck[i].getName()).equals(cardDeck[j].getName())) {
                    isDupe = true;
                    break;
                }
            }
        }
        return isDupe;
    }

    public static boolean hasDupeCharacters() {
        boolean isDupe = false;
        for (int i = 0; i < characterDeckSize - 1; i++) {
            for (int j = i + 1; j < characterDeckSize; j++) {
                if ((characterDeck[i].getName()).equals(characterDeck[j].getName())) {
                    isDupe = true;
                    break;
                }
            }
        }
        return isDupe;
    }

    public static void selectCardsFromInfoDB(String cardToAdd) {
        try {
            //create the character array
            File charactersTxt = new File("Data\\SpecialCards.txt");
            Scanner fileSc = new Scanner(charactersTxt);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");

                String cardNameIn = lineSc.next();
                String cardDescripIn = lineSc.next();


                //if its the right card to add AND less than 8 have been added AND the card hasnt been added yet
                if (cardNameIn.equals(cardToAdd) && !(cardDeckSize > 9)) {
                    Card nextCard = new Card(cardNameIn, cardDescripIn);
                    cardDeck[cardDeckSize] = nextCard;
                    //addCardsToActiveDB(nextCard.toString());
                    cardDeckSize++;
                }

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DeckManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    private static void addCardsToActiveDB(String entry) {
//        File f = new File("Data\\SpecialCardDeck.txt");
//        try {
//            FileWriter fw = new FileWriter(f, true);
//            if (cardEntryNum == 5) {
//                fw.write(entry);
//            } else {
//                fw.write(entry + "\n");
//            }
//            cardEntryNum++;
//            fw.close();
//
//            //error checking
//            System.out.println("Successful written: " + entry);
//        } catch (IOException ex) {
//            Logger.getLogger(DeckManager.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("ERROR: Could not find file.");
//        }
//    }
//
//    public static void removeCardsFromActiveDB() {
//        File f = new File("Data\\SpecialCardDeck.txt");
//
//        try {
//            FileWriter fw = new FileWriter(f);
//            fw.write("");
//            fw.close();
//
//            //error checking
//            System.out.println("Successful cleared");
//        } catch (IOException ex) {
//            Logger.getLogger(DeckManager.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("ERROR: Could not find file.");
//        }
//        cardEntryNum = 0;
//    }

    //for testing/ debugging
//    public static void printCards() {
//        System.out.println("\n");
//        for (int i = 0; i < cardDeckSize; i++) {
//            System.out.println("Cards in deck: " + cardDeck[i].getName());
//            System.out.println("Deck size: " + cardDeckSize);
//        }
//    }
//
//    public static void printChars() {
//        System.out.println("\n");
//        for (int i = 0; i < characterDeckSize; i++) {
//            System.out.println("Cards in deck: " + characterDeck[i].getName());
//            System.out.println("Deck size: " + characterDeckSize);
//        }
//    }

    public static void clearCharacterDeck() {
        for (int i = 0; i < characterDeckSize; i++) {
            characterDeck[i] = null;
            isFullDeck = false;
        }
        characterDeckSize = 0;
    }
    
    public static void deleteCharacter(int posToDelete) {
   
            characterDeck[posToDelete] = null;
        characterDeckSize = characterDeckSize-1;
    }

    public static void clearCardDeck() {
        for (int i = 0; i < cardDeckSize; i++) {
            cardDeck[i] = null;
            isFullDeck = false;
        }
        cardDeckSize = 0;
    }
    //CHANGING VALUES OF CHARACTERS IN THE DECK
    

}
