import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FizzBuzzTranslateTest {
    @Test
    void FizzbuzzTest10(){
        int a = 10;
        String expected = "10";
        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected,result);
    }
    @Test
    void FizzbuzzTest3(){
        int a = 3;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected,result);
    }
    @Test
    void FizzbuzzTest5(){
        int a = 5;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected,result);
    }
    @Test
    void FizzbuzzTest15(){
        int a = 15;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected,result);
    }
}
