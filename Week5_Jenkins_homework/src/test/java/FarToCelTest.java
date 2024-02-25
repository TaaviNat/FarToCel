import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FarToCelTest {

    @Test
    public void testConvertFarToCelsius() {
        double fahrenheit = 100;
        int expectedCelsius = 38;
        int actualCelsius = FarToCel.convertFar(fahrenheit);
        assertEquals(expectedCelsius, actualCelsius, "Fahrenheit to Celsius conversion failed.");
    }

    @Test
    public void testKelvinToCelsius() {
        float kelvin = 273.15f;
        float expectedCelsius = 0.0f;
        float actualCelsius = FarToCel.KelvinToCelsius(kelvin);
        assertEquals(expectedCelsius, actualCelsius, 0.01f, "Kelvin to Celsius conversion failed.");
    }
}
