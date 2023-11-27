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
public class StatsManager {

    private static int ptsInMatch;
    private static int totalPoints;
    private static int entriesAdded;
    private static int numMoves;

    public static int getPtsInMatch() {
        return ptsInMatch;
    }

    public static int getNumMoves() {
        return numMoves;
    }

    private static void writePointsTODB(int skillPts, String username) {
        boolean hasThisUser = false;

        try {
            // Read the existing data from the file
            File f = new File("Data\\SkillPoints.txt");
            Scanner fileSc = new Scanner(f);

            //more efficient than normal string + allows mutation
            StringBuilder newData = new StringBuilder();

            while (fileSc.hasNextLine()) {
                String currentLine = fileSc.nextLine();
                if (currentLine.contains(username)) {
                    currentLine += "#" + skillPts;
                    hasThisUser = true;
                }
                newData.append(currentLine).append("\n");
            }

            // If the user is not found in the existing data, add them
            if (!hasThisUser) {
                newData.append(username).append("#").append(skillPts).append("\n");
            }

            // Write the updated data back to the file
            FileWriter fw = new FileWriter(f);
            fw.write(newData.toString());
            fw.close(); // Close the FileWriter when done

            System.out.println("Data written successfully.");
        } catch (IOException ex) {
            Logger.getLogger(StatsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        entriesAdded++;
    }

    public static String getRecentDeckChars() {
        File deckTxt = new File("Data\\CharacterDeck.txt");
        String charactersStr="";
        try {
            Scanner fileSc = new Scanner(deckTxt);
            for (int i = 0; i < 3; i++) {
          
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String charName = lineSc.next();
                String elemType = lineSc.next();
                String weaponType = lineSc.next();

                int physDMG = lineSc.nextInt();
                int skillDMG = lineSc.nextInt();
                int burstDMG = lineSc.nextInt();
                String lore = lineSc.next();
                charactersStr += charName + ". ";
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StatsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return charactersStr;
    }
    
    public static String getRecentDeckCards() {
        File deckTxt = new File("Data\\CardDeck.txt");
        String cardsStr="";
        try {
            Scanner fileSc = new Scanner(deckTxt);
            for (int i = 0; i < 6; i++) {
                
                String line = fileSc.nextLine();
                
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String cardName = lineSc.next();
                String description = lineSc.next();
                cardsStr += cardName + ". ";
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StatsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cardsStr;
    }

    //add to the num points in the game rn
    public static void sumPtsInRound(int addSkillPts, String username) {
        ptsInMatch += addSkillPts;
        writePointsTODB(addSkillPts, username);
    }

    public static int countTotalPts(String username) {
        File f = new File("Data\\SkillPoints.txt");

        try {
            Scanner fileSc = new Scanner(f);

            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();

                // Check if the line contains the user's data
                if (line.contains(username)) {
                    // Create a Scanner to parse the line
                    Scanner lineSc = new Scanner(line).useDelimiter("#");
                    String usernameHolder = lineSc.next();

                    // Process the skill points
                    while (lineSc.hasNextInt()) {
                        totalPoints += lineSc.nextInt();
                    }

                    System.out.println("total points: " + totalPoints);
                }
            }

            fileSc.close();
        } catch (IOException ex) {
            Logger.getLogger(StatsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalPoints;
    }

    public static void incNumMoves() {
        numMoves++;
    }

}
