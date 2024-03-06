package org.example;

public class App {

    public static int convertFar(double far) {
        return (int) Math.round((far - 32) * 5 / 9);
    }

    public static float kelvinToCelsius(float kelvin) {
        return (float) (kelvin - 273.15);
    }
    public static void main(String[] args) {
        System.out.println(App.convertFar(100.0));
        System.out.println(App.kelvinToCelsius(100.0F));
    }
}
