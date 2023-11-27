/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND;

import static BACKEND.DeckManager.characterDeck;
import static BACKEND.DeckManager.characterDeckSize;

/**
 *
 * @author dhiys
 */
public class SpecialCardsEffects {

    public static void playCardEffect(Card cardToPlay) {

        //CARD 1
        if (cardToPlay.getName().equals("Increase Pyro Damage")) {
            for (int i = 0; i < characterDeckSize; i++) {
                if (characterDeck[i].getElementType().equals("Pyro")) {
                    //not for phys attacks
                    characterDeck[i].setSkillDmg(characterDeck[i].getSkillDmg() + 1);
                    characterDeck[i].setBurstDmg(characterDeck[i].getBurstDmg() + 1);
                }
            }
        }
        if (cardToPlay.getName().equals("Increase Cryo Damage")) {
            for (int i = 0; i < characterDeckSize; i++) {
                if (characterDeck[i].getElementType().equals("Cryo")) {
                    characterDeck[i].setSkillDmg(characterDeck[i].getSkillDmg() + 1);
                    characterDeck[i].setBurstDmg(characterDeck[i].getBurstDmg() + 1);
                }
            }
        }
        if (cardToPlay.getName().equals("Increase Electro Damage")) {
            for (int i = 0; i < characterDeckSize; i++) {
                if (characterDeck[i].getElementType().equals("Electro")) {
                    characterDeck[i].setSkillDmg(characterDeck[i].getSkillDmg() + 1);
                    characterDeck[i].setBurstDmg(characterDeck[i].getBurstDmg() + 1);
                }
            }
        }
        if (cardToPlay.getName().equals("Increase Hydro Damage")) {
            for (int i = 0; i < characterDeckSize; i++) {
                if (characterDeck[i].getElementType().equals("Hydro")) {
                    characterDeck[i].setSkillDmg(characterDeck[i].getSkillDmg() + 1);
                    characterDeck[i].setBurstDmg(characterDeck[i].getBurstDmg() + 1);
                }
            }
        }
        if (cardToPlay.getName().equals("Increase Polearm Damage")) {
            for (int i = 0; i < characterDeckSize; i++) {
                if (characterDeck[i].getWeaponType().equals("Polearm")) {
                    characterDeck[i].setPhysDmg(characterDeck[i].getPhysDmg() + 1);
                    characterDeck[i].setSkillDmg(characterDeck[i].getSkillDmg() + 1);
                    characterDeck[i].setBurstDmg(characterDeck[i].getBurstDmg() + 1);
                }
            }
        }
        if (cardToPlay.getName().equals("Increase Claymore Damage")) {
            for (int i = 0; i < characterDeckSize; i++) {
                if (characterDeck[i].getWeaponType().equals("Claymore")) {
                    characterDeck[i].setPhysDmg(characterDeck[i].getPhysDmg() + 1);
                    characterDeck[i].setSkillDmg(characterDeck[i].getSkillDmg() + 1);
                    characterDeck[i].setBurstDmg(characterDeck[i].getBurstDmg() + 1);
                }
            }
        }
        if (cardToPlay.getName().equals("Increase Bow Damage")) {
            for (int i = 0; i < characterDeckSize; i++) {
                if (characterDeck[i].getWeaponType().equals("Bow")) {
                    characterDeck[i].setPhysDmg(characterDeck[i].getPhysDmg() + 1);
                    characterDeck[i].setSkillDmg(characterDeck[i].getSkillDmg() + 1);
                    characterDeck[i].setBurstDmg(characterDeck[i].getBurstDmg() + 1);
                }
            }
        }

//        if (cardToPlay.getName().equals("Draw Two Cards")) {
//            DiceAndHandManager.addSpecialCards(6, 1, 2);
//            DiceAndHandManager.setCardsInHandSize(DiceAndHandManager.getCardsInHandSize() + 2);
//        }
        if (cardToPlay.getName().equals("One Less Dice")) {
            for (int i = 0; i < characterDeckSize; i++) {
                characterDeck[i].setPhysCost(characterDeck[i].getPhysCost() - 1);
                characterDeck[i].setSkillCost(characterDeck[i].getSkillCost() - 1);
                characterDeck[i].setBurstCost(characterDeck[i].getBurstCost() - 1);
            }
        }
        if (cardToPlay.getName().equals("Heal Two HP")) {
            for (int i = 0; i < characterDeckSize; i++) {
                if (characterDeck[i].getHp() <= 13) {
                    characterDeck[i].setHp(characterDeck[i].getHp() + 2);
                } else if (characterDeck[i].getHp() == 14) {
                    characterDeck[i].setHp(characterDeck[i].getHp() + 1);
                }

            }
        }
        if (cardToPlay.getName().equals("Heal One HP")) {
            int max = 2;
            int min = 0;
            int randInt = (int) (Math.random() * (max - min + 1) + min);
            if (!(characterDeck[randInt].getHp() == 14)) {
                characterDeck[randInt].setHp(characterDeck[randInt].getHp() + 1);
            }

        }
        if (cardToPlay.getName().equals("Deal 3 Damage For Free")) {
            BACKEND.BattleController.getActiveEnemy().setHealth(BACKEND.BattleController.getActiveEnemy().getHealth() - 3);
        }

    }

    public static void resetDiceCost() {
        for (int i = 0; i < characterDeckSize; i++) {
            characterDeck[i].setPhysCost(2);
            characterDeck[i].setSkillCost(3);
            characterDeck[i].setBurstCost(5);

        }
    }

}
