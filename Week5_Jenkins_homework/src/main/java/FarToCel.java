public class FarToCel {
    public static int convertFar(double far) {
        return (int) Math.round((far - 32) * 5 / 9);
    }

    public static float KelvinToCelsius(float kelvin) {
        return (float) (kelvin - 273.15);
    }
}