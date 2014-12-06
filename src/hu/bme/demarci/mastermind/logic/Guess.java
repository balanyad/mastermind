package hu.bme.demarci.mastermind.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Marcell
 */
public class Guess {

    private List<Dot> value;
    private List<GuessResult> result;
    private boolean readOnly;

    public Guess(List<Dot> value, boolean readOnly) {
        this.value = new ArrayList(value);
        this.readOnly = readOnly;
    }

    public Guess() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<GuessResult> getResult() {
        return Collections.unmodifiableList(result);
    }

    void evaluateWith(Secret secret) {
        result = new ArrayList<>();
        
        for (int i = 0; i < secret.length(); i++) {
            if (secret.check(i, value.get(i))) {
                result.add(GuessResult.FULL);
            }
        }
        
        
        
//        int numberOfColors=Dot.values().length;
//        int ta[] = new int[numberOfColors];
//        int tb[] = new int[numberOfColors];
//        for (int i = 0; i < numberOfColors; i++) {
//            ta[i]=0; tb[i]=0;
//        }
//        for (int i = 0; i < 4; i++) {
//           
//        }
        
    }
}
