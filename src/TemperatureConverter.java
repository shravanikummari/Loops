public class TemperatureConverter {
        public static double convertTemperature(double temperature, char conversionType) {
            double convertedTemperature;
            if (conversionType == 'C') {
                convertedTemperature = temperature * 9 / 5 + 32;
            } else if (conversionType == 'F') {
                convertedTemperature = (temperature - 32) * 5 / 9;
            } else {
                throw new IllegalArgumentException("Invalid conversion type. Use 'C' for Celsius to Fahrenheit or 'F' for Fahrenheit to Celsius.");
            }

            return convertedTemperature;
        }

        public static void main(String[] args) {
            // Example usage:
            double celsius = 25.0;
            double fahrenheit = 77.0;

            double convertedToFahrenheit = convertTemperature(celsius, 'C');
            double convertedToCelsius = convertTemperature(fahrenheit, 'F');

            System.out.println(celsius + "°C is " + convertedToFahrenheit + "°F");
            System.out.println(fahrenheit + "°F is " + convertedToCelsius + "°C");
        }
    }

