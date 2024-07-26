public class TemperatureConverter {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        double fahrenheit = 100.0;
        double celsius = 37.7778;
        
        System.out.println(fahrenheit + " Fahrenheit é igual a " + fahrenheitToCelsius(fahrenheit) + " Celsius.");
        System.out.println(celsius + " Celsius é igual a " + celsiusToFahrenheit(celsius) + " Fahrenheit.");
    }
}
