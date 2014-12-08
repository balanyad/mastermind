package hu.bme.demarci.mastermind.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Marcell
 */
public class MastermindLogic implements GameLogic{
    
    private GameState gamestate;
    private List<Guess> guesses;
    Secret solution;
    public static int round = 0;
    
    @Override
    public void init() {
        // init attributes
        gamestate = GameState.IN_GAME;
        guesses = new ArrayList<>();
        
        // create solution
        Dot[] colors = Dot.values();
        Random rand = new Random();
        List<Dot> code = new ArrayList<>(4);
        for (int i = 0; i < 4; ++i)
            code.set(i, colors[rand.nextInt(colors.length)]);
        solution = new Secret(code);
    }

    @Override
    public void nextStep() {
        // TODO set readonlys
        round++;
    	// TODO evaluate
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addGuess(List<Dot> guess) {
        guesses.add(new Guess(guess, true));
    }

    @Override
    public GameState getState() {
        return gamestate;
    }
    
}
