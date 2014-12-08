/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.bme.demarci.mastermind;

import hu.bme.demarci.mastermind.logic.MastermindLogic;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Marcell
 */
public class Game {

    GameController controller = new GameController();
    MastermindLogic mmlogic = new MastermindLogic();
    static ArrayList<Point> centerOfCirclesCheck = new ArrayList<Point>();
    static ArrayList<Point> centerOfCirclesGuess = new ArrayList<Point>();
    
    

    public Game() {
        // TODO mainview---(register click)--->controller---(color list)--->mastermindlogic
    }

    public static void main(String args[]) {
    	//first GuessResult (Z-form sequence)
    	centerOfCirclesCheck.add(new Point(20,426));
    	centerOfCirclesCheck.add(new Point(43,426));
    	centerOfCirclesCheck.add(new Point(20,449));
    	centerOfCirclesCheck.add(new Point(43,449));

    	centerOfCirclesCheck.add(new Point(20,359));
    	centerOfCirclesCheck.add(new Point(43,359));
    	centerOfCirclesCheck.add(new Point(20,392));
    	centerOfCirclesCheck.add(new Point(43,392));

    	centerOfCirclesCheck.add(new Point(20,291));
    	centerOfCirclesCheck.add(new Point(43,291));
    	centerOfCirclesCheck.add(new Point(20,314));
    	centerOfCirclesCheck.add(new Point(43,314));

    	centerOfCirclesCheck.add(new Point(20,224));
    	centerOfCirclesCheck.add(new Point(43,224));
    	centerOfCirclesCheck.add(new Point(20,247));
    	centerOfCirclesCheck.add(new Point(43,247));

    	centerOfCirclesCheck.add(new Point(20,156));
    	centerOfCirclesCheck.add(new Point(43,156));
    	centerOfCirclesCheck.add(new Point(20,179));
    	centerOfCirclesCheck.add(new Point(43,179));

    	centerOfCirclesCheck.add(new Point(20,89));
    	centerOfCirclesCheck.add(new Point(43,89));
    	centerOfCirclesCheck.add(new Point(20,112));
    	centerOfCirclesCheck.add(new Point(43,112));
    	 
    	centerOfCirclesCheck.add(new Point(20,21));
    	centerOfCirclesCheck.add(new Point(43,21));
    	centerOfCirclesCheck.add(new Point(20,44));
    	centerOfCirclesCheck.add(new Point(43,44));

    	//guesses first_try letftoright
    	centerOfCirclesGuess.add(new Point(97,441));
    	centerOfCirclesGuess.add(new Point(153,441));
    	centerOfCirclesGuess.add(new Point(211,441));
    	centerOfCirclesGuess.add(new Point(268,441));

    	centerOfCirclesGuess.add(new Point(97,374));
    	centerOfCirclesGuess.add(new Point(153,374));
    	centerOfCirclesGuess.add(new Point(211,374));
    	centerOfCirclesGuess.add(new Point(268,374));

    	centerOfCirclesGuess.add(new Point(97,307));
    	centerOfCirclesGuess.add(new Point(153,307));
    	centerOfCirclesGuess.add(new Point(211,307));
    	centerOfCirclesGuess.add(new Point(268,307));

    	centerOfCirclesGuess.add(new Point(97,240));
    	centerOfCirclesGuess.add(new Point(153,240));
    	centerOfCirclesGuess.add(new Point(211,240));
    	centerOfCirclesGuess.add(new Point(268,240));

    	centerOfCirclesGuess.add(new Point(97,173));
    	centerOfCirclesGuess.add(new Point(153,173));
    	centerOfCirclesGuess.add(new Point(211,173));
    	centerOfCirclesGuess.add(new Point(268,173));

    	centerOfCirclesGuess.add(new Point(97,106));
    	centerOfCirclesGuess.add(new Point(153,106));
    	centerOfCirclesGuess.add(new Point(211,106));
    	centerOfCirclesGuess.add(new Point(268,106));

    	centerOfCirclesGuess.add(new Point(97,39));
    	centerOfCirclesGuess.add(new Point(153,39));
    	centerOfCirclesGuess.add(new Point(211,39));
    	centerOfCirclesGuess.add(new Point(268,39));

    	
        Game game= new Game();
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }
}
