package Package1;

public class HW_Temp {

    public static void main(String[] args) {

        double celsius = 25;

        // Celsius to Kelvin
        double kelvin = celsius + 273.15;
        System.out.println(kelvin);

        // Celsius to Fahrenheit
        double fahrenheit = (celsius * 9) / 5 + 32;
        System.out.println(fahrenheit);

        double kelvin = 300;

        // Kelvin to Celsius
        double celsius = kelvin - 273.15;
        System.out.println(celsius);

        // Kelvin to Fahrenheit
        double fahrenheit = (kelvin * 9) / 5 - 459.57;
        System.out.println(fahrenheit);


    }
}
