package hu.bme.demarci.mastermind.logic;

/**
 *
 * @author Marcell
 */
public enum Dot {
    RED(0),GREEN(1),BLUE(2),MAGENTA(3),YELLOW(4),CYAN(5),ORANGE(6),PURPLE(7);
    
    private final int val;
    private Dot(int val_) { val = val_; }
    
    public int getVal() { return val; }
}
