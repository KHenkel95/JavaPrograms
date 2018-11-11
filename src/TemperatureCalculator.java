import java.util.Scanner;

public class TemperatureCalculator {
    public static void main(String[] args) {
        Scanner input_temperature = new Scanner(System.in);
        System.out.println("What is the temperature in Fahrenheit today?");
        int temperatureF = input_temperature.nextInt();
        int temperatureC = (temperatureF-32)*5/9;
        System.out.println("The temperature in Celsius today is "
                + temperatureC);
        input_temperature.close();
    }
}
