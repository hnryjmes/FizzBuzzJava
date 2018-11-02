import com.example.fizzbuzz.FizzBuzzConverter;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzConvertersTest {

    // Write a program that prints the numbers from 1 to 100.
    // But for multiples of three print "Fizz" instead of the number
    // and for the multiples of five print "Buzz".
    // For numbers which are multiples of both three and five print "FizzBuzz"

    @Test
    public void fizzBuzzConverterForOne() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("1", fizzBuzz.convert(1));
    }

    @Test
    public void fizzBuzzConverterForTwo() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("2", fizzBuzz.convert(2));
    }

    @Test
    public void fizzBuzzConverterForMultiplesOfThree() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    public void fizzBuzzConverterForMultiplesOfFive() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("Buzz", fizzBuzz.convert(5));
    }

    @Test
    public void fizzBuzzConverterForMultiplesOfFifteen() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }

}
