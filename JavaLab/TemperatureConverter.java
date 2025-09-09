public class TemperatureConverter {
        double celsiusToFahrenheit(double c) {
            return (c * 9 / 5) + 32;
        }

        double fahrenheitToCelsius(double f) {
            return (f - 32) * 5 / 9;
        }

        public static void main(String[] args) {
            TemperatureConverter t = new TemperatureConverter();
            System.out.println("37°C = " + t.celsiusToFahrenheit(37) + "°F");
            System.out.println("98.6°F = " + t.fahrenheitToCelsius(98.6) + "°C");
        }
    }
