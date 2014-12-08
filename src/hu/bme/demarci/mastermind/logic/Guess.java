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
        ArrayList<Integer> ta = new ArrayList<Integer>(8);          // TODO full: hely és szin
        ArrayList<Integer> tb = new ArrayList<Integer>(8);
        for (int c = 0; c < 8; ++c) {
            ta.add(0);
            tb.add(0);
        }

        for (int j = 0; j < 4; ++j) {
            int taindex = value.get(j).getVal();
            Integer tacurr = ta.get(taindex);
            ta.set(taindex, ++tacurr);
            
            int tbindex = secret.getCode().get(j).getVal();
            Integer tbcurr = tb.get(tbindex);
            tb.set(tbindex, ++tbcurr);
        }

        int npartial = 0;
        for (int j = 0; j < 8; j++) {
            npartial += Math.min(ta.get(j), tb.get(j));
        }

        int nnothing = 4 - npartial;
        npartial -= result.size(); // npartial - nfull
        for (int j = 0; j < npartial; j++)
            result.add(GuessResult.PARTIAL);
        for (int j = 0; j < nnothing; j++)
            result.add(GuessResult.NOTHING); // TODO test
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
