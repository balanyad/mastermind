package hu.bme.demarci.mastermind.logic;

/**
 *
 * @author Marcell
 */
public interface GameLogic {

    void init();

    void nextStep();

    GameState getState();
}
