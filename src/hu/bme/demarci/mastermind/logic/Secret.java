package hu.bme.demarci.mastermind.logic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcell
 */
public class Secret {

    private List<Dot> code;

    public Secret(List<Dot> colors) {
        this.code = new ArrayList(colors);
    }
    
    public boolean check(int pos, Dot value) {
        return code.get(pos) == value;
    }

    public int length() {
        return code.size();
    }
}
