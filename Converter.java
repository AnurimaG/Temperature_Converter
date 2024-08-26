public class Converter {

    //Method to convert from Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius)
    {
        return (celsius * 9/5) + 32;
    }

    //Method to convert from Fahrenheit to Celsius
    public double FahrenheitToCelsius(double fahrenheit)
    {
        return (fahrenheit - 32)*5/9;
    }
}