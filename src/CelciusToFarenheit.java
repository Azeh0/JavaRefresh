import java.util.Scanner;
public class CelciusToFarenheit {
    public static void main(String[] args) {
        Scanner KB = new Scanner(System.in);

        String scale;
        double temperature, unit;

        System.out.println("Enter in C or F");

        scale = KB.nextLine();
        scale = scale.toLowerCase();

        if(scale.equals("c")){
            System.out.println("Enter in the temperature");
            temperature = KB.nextInt();
            unit = (temperature * 9/5) + 32;
            System.out.println("That in Fahrenheit is " + unit);
        }
        else if(scale.equals("f")){
            System.out.println("Enter in the temperature");
            temperature = KB.nextInt();
            unit = (temperature - 32) * 5/9;
            System.out.println("That in Celsius is " + unit);
        }
        else{
            System.out.println("Must choose either C or F!");
        }
    }
}