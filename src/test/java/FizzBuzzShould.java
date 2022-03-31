import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzShould {

    @Test
    void test_passed(){
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1",fb.play(1));
        assertEquals("Buzz", fb.play(25));
        assertEquals("Fizz", fb.play(3));
        assertEquals("FizzBuzz", fb.play(15));
    }


    @Test
    void test_failed(){
        FizzBuzz fb = new FizzBuzz();
        assertEquals("3",fb.play(3));
        assertEquals("Fizz", fb.play(1));
        assertEquals("Buzz", fb.play(3));
        assertEquals("FizzBuzz", fb.play(15));
    }


}
