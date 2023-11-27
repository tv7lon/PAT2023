/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND;

import static BACKEND.DeckManager.*;
import java.awt.Color;

/**
 *
 * @author dhiys
 */
public class ViewingManager {

    public static Character returnCharacter(int posToReturn) {
        return characterDeck[posToReturn];
    }

    public static Card returnCard(int posToReturn) {
        return cardDeck[posToReturn];
    }

    //overloads
    public static Character returnCharacter(String nameToReturn) {
        for (int i = 0; i < characterDeckSize; i++) {
            if ((characterDeck[i].getName().equals(nameToReturn))) {
                return characterDeck[i];
            }
        }
        return null;
    }

    public static Character returnCharacterFromElement(String element) {
        for (int i = 0; i < characterDeckSize; i++) {
            if ((characterDeck[i].getElementType().equals(element))) {
                return characterDeck[i];
            }
        }
        return null;
    }

    public static Card returnCard(String nameToReturn) {
        for (int i = 0; i < cardDeckSize; i++) {
            if ((cardDeck[i].getName().equals(nameToReturn))) {
                return cardDeck[i];
            }
        }
        return null;
    }

//    public static void setIcon(String imageName){
//        String url = "/images/" + imageName+ ".png";
//        //make templates showing each chars thing
//        ImageIcon imageIcon = new ImageIcon(url);
//    }
}
