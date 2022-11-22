import Cake.Cheesecake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CheesecakeTest {

    private Cheesecake cheesecake;

    @BeforeEach
    public void setUp() {
        cheesecake = new Cheesecake("Not So Cheesy Cake","vanilla", 400,"digestives", "no-bake");
    }

    @Test
    public void canCrushBiscuits() {
        String expected = "crush biscuits for 1 minute.";
        String actual = cheesecake.crushBiscuitsForBase();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canBakeCheesecakes() {
        String expected = "Cheesecakes an either be baked (25 minutes) or refrigerated.";
        String actual = cheesecake.bake();
        assertThat(actual).isEqualTo(expected);

    }



}
