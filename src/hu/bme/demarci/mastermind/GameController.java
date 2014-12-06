/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.bme.demarci.mastermind;

/**
 *
 * @author Marcell
 */
public class GameController {

    long startTime;

    void start() {
        startTime = System.currentTimeMillis();     //oraatallitas? az ellen nem veed
    }

    void nextStep() {
    }

    void finish() {
        long endTime = System.currentTimeMillis() - startTime;
    
    }

}
