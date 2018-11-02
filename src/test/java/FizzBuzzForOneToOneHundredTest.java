import com.example.fizzbuzz.FizzBuzzConverter;
import org.junit.Test;

public class FizzBuzzForOneToOneHundredTest {

    @Test
    public void outputFizzBuzzForOneToOneHundred() {

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.convert(i));
        }

    }

}

