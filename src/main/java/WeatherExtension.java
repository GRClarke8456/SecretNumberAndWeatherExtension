import java.util.Scanner;
public class WeatherExtension {
    public static void main(String[] args) {
        //The What should I wear extension

        System.out.println("What should I wear today?");
        System.out.println("Tell us about the weather: ");

        Scanner reader = new Scanner(System.in);
        String weatherToday = reader.nextLine();

        System.out.println("Now tell us about the temperature in C: ");

        Scanner reader2 = new Scanner(System.in);
        int tempToday =  reader2.nextInt();

        if (weatherToday.equals("Sunny") && tempToday >= 24) {
            System.out.println("It's hot and sunny. Wear light and put on sunscreen.");
        } else if (weatherToday.equals("Rainy")){
            System.out.println("There's rain. Wear a coat");
        } else if (weatherToday.equals("Snow") && tempToday <= 5) {
            System.out.println("It's cold and snowy. Wear a winter coat and wellies.");
        } else if (weatherToday.equals("Cloudy") && tempToday <= 23 && tempToday >= 15) {
            System.out.println("Normal weather. Dress how you like.");
        } else if (weatherToday.equals("Sunny") && tempToday <= 14) {
            System.out.println("It might be sunny but it's still cold. Dress up warm.");
        } else {
            System.out.println("Sorry, can't help.");
        }
    }

    }

