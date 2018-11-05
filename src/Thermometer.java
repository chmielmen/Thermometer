import java.util.Scanner;
public class Thermometer {

    public static double checkTemperature(double temperature) {
        if (temperature > 0) {
            System.out.println("Temperature above than zero = " + temperature + " degrees C " + "(" + (temperature - 273.15) + " K)");
        } else if (temperature < 0) {
            System.out.println("Temperature bellow zero = " + temperature + " degrees C " + "(" + (temperature - 273.15) + " K)");
        } else {
            System.out.println("Temperature equal to zero" + " degrees C "+ "(- 273.15 K)" );
        }
        return temperature;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature;

        System.out.println("Enter temperature: ");
        temperature = scanner.nextDouble();

        checkTemperature(temperature);
    }
}