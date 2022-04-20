import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzShould {


    //Numbers not multiples of 3 or 5 return the same number
    //Numbers multiples of 3 return Fizz
    //Numbers multiples of 5 return Buzz
    //Numbers multiples of 3 and 5 return FizzBuzz


    @Test
    void inputNumbersNotMultiplesThreeOrFive() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals(fb.play(1), "1");
    }

    @Test
    void inputNumberMultiplesOfThree(){
        FizzBuzz fb = new FizzBuzz();
        assertEquals(fb.play(3), "Fizz");
    }

    @Test
    void inputNumberMultiplesOfFive(){
        FizzBuzz fb = new FizzBuzz();
        assertEquals(fb.play(5), "Buzz");
    }

    @Test
    void inputNumberMultiplesOfThreeAndFive(){
        FizzBuzz fb = new FizzBuzz();
        assertEquals(fb.play(15), "FizzBuzz");
    }







}
