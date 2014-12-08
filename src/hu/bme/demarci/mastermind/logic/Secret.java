package hu.bme.demarci.mastermind.logic;

import java.util.ArrayList;
import java.util.Collections;
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
    
    public List<Dot> getCode() {
        return Collections.unmodifiableList(code);
    }
    
    public boolean check(int pos, Dot value) {
        if (code.get(pos) == value) return true;
        return false;
    }

    public int length() {
        return code.size();
    }
}
