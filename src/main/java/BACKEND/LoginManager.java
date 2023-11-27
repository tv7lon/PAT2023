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
public class LoginManager {

    private static String username;

    public static boolean checkPass(String userIn, String passIn) {
        boolean isCorrectLogin = false;
        try {
            //file sc
            File loginDet = new File("Data\\LoginDetails.txt");
            Scanner fileSc = new Scanner(loginDet);

            while (fileSc.hasNextLine()) {
                //line sc
                String line = fileSc.nextLine();
                Scanner lineSC = new Scanner(line).useDelimiter("#");

                String correctUser = lineSC.next();
                String correctPass = lineSC.next();

                if ((userIn.equals(correctUser)) && (passIn.equals(correctPass))) {
                    //show nextscreen
                    isCorrectLogin = true;
                    username = correctUser;
                    break;
                }
            }
            fileSc.close();
        } catch (Exception e) {
            System.out.println("Cannot find file.");
        }

        return isCorrectLogin;
    }

    public static String getUser() {
        return username;
    }

    public static void addUser(String username, String password) {
        File loginDet = new File("Data\\LoginDetails.txt");

        try {

            FileWriter fw = new FileWriter(loginDet, true);
            fw.write(username + "#" + password + "\n");
            //System.out.println("printing " + username + password);
            fw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean canAddUser(String username, String password) {
        boolean canAdd = true;
        File loginDet = new File("Data\\LoginDetails.txt");
        if ((username.isBlank() || password.isBlank())) {
            canAdd = false;
        }
        try {
            Scanner fileSc = new Scanner(loginDet);

            while (fileSc.hasNextLine()) {
                //line sc
                String line = fileSc.nextLine();
                Scanner lineSC = new Scanner(line).useDelimiter("#");

                String currentUser = lineSC.next();
                String currentPass = lineSC.next();

                if (username.equals(currentUser) && password.equals(currentPass)) {
                    canAdd = false;
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(LoginManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return canAdd;
    }
}
