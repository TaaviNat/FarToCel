import org.example.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testConvertFarToCelsius() {
        double fahrenheit = 100;
        int expectedCelsius = 38;
        int actualCelsius = App.convertFar(fahrenheit);
        assertEquals(expectedCelsius, actualCelsius, "Fahrenheit to Celsius conversion failed.");
    }

    @Test
    public void testKelvinToCelsius() {
        float kelvin = 273.15f;
        float expectedCelsius = 0.0f;
        float actualCelsius = App.kelvinToCelsius(kelvin);
        assertEquals(expectedCelsius, actualCelsius, 0.01f, "Kelvin to Celsius conversion failed.");
    }
}
