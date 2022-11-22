import Cake.Cupcake;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {

    private Cupcake cupcake;

    @BeforeEach
    public void setUp() {
        cupcake = new Cupcake("cookieeez", "cookies and cream", 270, "chocolate");
        cupcake.addTopping("sprinkles");
        cupcake.addTopping("oreo");
    }

//    @Test
//    public void canAddTopping() {
//        ArrayList addTopping = cupcake.getToppings();
//        assertThat(addTopping).isEqualTo(1);
//    }

    @Test
    public void canUseCorrectCupcakeCase() {
        String expected = "all cupcakes have the right size casing!";
        String actual = cupcake.cupcakeInCasing();
        assertThat(actual).isEqualTo(expected);

    }
    // Overloaded method testing

    @Test
    public void canAddCupcakeDesign() {
        String expected = "Our most popular cupcake design is vanilla buttercream";
        String actual = cupcake.addCupcakeDesign("vanilla buttercream");
        assertThat(actual).isEqualTo(expected);

    }

    @Test 
    public void canAddCustomerCupcakeDesign() {
        String expected = "Customer chooses to design their cupcake decor: pink icing with purple sparkles. required waiver number is 881439";
        String actual = cupcake.addCupcakeDesign("pink icing with purple sparkles",881439);
        assertThat(actual).isEqualTo(expected);



    }

    // abstract method testing
    @Test
    public void canBakeCupcake() {
        String expected = "Cupcake bake time is 15-20 minutes";
        String actual = cupcake.bake();
        assertThat(actual).isEqualTo(expected);
    }



}
