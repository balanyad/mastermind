package hu.bme.demarci.mastermind.logic;

import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marcell
 */
public class GuessTest {

    public GuessTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testEvaluateWith_on_full_eq() {
        List<Dot> dots = Arrays.asList(Dot.BLUE, Dot.RED, Dot.GREEN, Dot.YELLOW);
        Secret secret = new Secret(dots);

        Guess instance = new Guess(dots, true);
        instance.evaluateWith(secret);
        assertEquals(Arrays.asList(GuessResult.FULL, GuessResult.FULL,
                GuessResult.FULL, GuessResult.FULL),
                instance.getResult());
    }

}
