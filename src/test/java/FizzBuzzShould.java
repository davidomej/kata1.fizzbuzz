import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzShould {

    @Test
    void test_library(){
        FizzBuzz fb = new FizzBuzz();
        assertEquals(fb.play(15), "FizzBuzz");
    }







}
