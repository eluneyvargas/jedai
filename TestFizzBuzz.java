import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest; 
import org.junit.jupiter.params.provider.CsvSource;

public class TestFizzBuzz {
	
	@ParameterizedTest
    @CsvSource({
    "15",
    "30",
    "45",
    "60"
	})
	
	public void quanEntradaMultiple3i5(int entrada) {
		String esperat = "FizzBuzz";
		String trobat = Kata.fizzBuzz(entrada);
		assertEquals(esperat, trobat);
	}
    
    @ParameterizedTest
    @CsvSource({
    "1",
    "2",
    "4",
    "8",
    "11",
    "13",
    "16",
    "17",
    "19"
	})
	
	public void quanEntradaN(int entrada) {
		String esperat = String.format("%d", entrada);
		String trobat = Kata.fizzBuzz(entrada);
		assertEquals(esperat, trobat);
	}
	@ParameterizedTest
    @CsvSource({
    "3",
    "6",
    "9",
    "12"
	})
	
	public void quanEntradaMultiple3(int entrada) {
		String esperat = "Fizz";
		String trobat = Kata.fizzBuzz(entrada);
		assertEquals(esperat, trobat);
	}
	@ParameterizedTest
    @CsvSource({
    "5",
    "10",
    "20",
    "25"
	})
	
	public void quanEntradaMultiple5(int entrada) {
		String esperat = "Buzz";
		String trobat = Kata.fizzBuzz(entrada);
		assertEquals(esperat, trobat);
	}
}
