/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pablomacias_ej2.exud4;

/**
 *
 * @author pmacsal2707
 */
public class conversor {
    public static void main(String[] argumentos) {
        float celsius = 0f;
        // Cálculo conversión
        float fahrenheit = celsiusAFahrenheit(celsius);
        System.out.printf("%f grados celsius son %f grados fahrenheit", celsius, fahrenheit);
    }
    
    public static float celsiusAFahrenheit(float celsius) {
        return (celsius * 1.8f) + 32.0f;
    }
 
    public static float fahrenheitACelsius(float fahrenheit) {
        return (fahrenheit - 32.0f) / 1.8f;
    }
}
