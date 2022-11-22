import Bakery.Bakery;
import Cake.Cake;
import Cake.Cupcake;
import Cake.Cheesecake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {

    private Bakery bakery;

    @BeforeEach
    public void setUp() {
        bakery = new Bakery("Hummingbird Bakery");
    }

    @Test
    public void canCountCakes() {
        int expected = 0;
        int actual = bakery.countCakes();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canAddCakes() {
        Cake cupcake1 = new Cupcake("Banofee Pudding","banana and toffee", 300, "toffee cream");
        Cake cupcake2 = new Cupcake("Red Velvet Wonder","vanilla", 280, "chocolate cream");
        Cake cupcake3 = new Cupcake("Apple Crumble","vanilla", 280, "chocolate cream");
        Cake cheesecake1 = new Cheesecake("Salted Caramel drizzle", "caramel", 400, "honeycomb biscuit", "no bake");
        Cake cheesecake2 = new Cheesecake("Chocolate cheesecake", "tripple chocolate", 500, "choc digestives", "no bake");
        bakery.addCake(cupcake1);
        bakery.addCake(cupcake2);
        bakery.addCake(cupcake3);
        bakery.addCake(cheesecake1);
        bakery.addCake(cheesecake2);
        int expected = 5;
        int actual = bakery.countCakes();
        assertThat(actual).isEqualTo(expected);

    }
}
