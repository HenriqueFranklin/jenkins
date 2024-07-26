package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class TesteConversor {

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0, ConversorTemperatura.fahrenheitToCelsius(32), 0.01);
        assertEquals(100, ConversorTemperatura.fahrenheitToCelsius(212), 0.01);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32, ConversorTemperatura.celsiusToFahrenheit(0), 0.01);
        assertEquals(212, ConversorTemperatura.celsiusToFahrenheit(100), 0.01);
    }
}
