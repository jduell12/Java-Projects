import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double cTemp = 0;
        double cSum = 0;
        double fSum = 0;
        double uInput = 0;

        System.out.println("Enter the temperature in Centigrade or <= -100 to quit:  ");
        cTemp = keyboard.nextDouble();

        while (cTemp > -100) {
            if (cTemp == -100) {
                double cAvg = cSum / uInput;
                double fAvg = fSum / uInput;
                System.out.println("Average Centigrade: (" + cAvg + ")");
                System.out.println("Average Fahrenheit: (" + fAvg + ")");
                break;
            } else {
                double fTemp = ((9.0 / 5.0) * cTemp) + 32;
                System.out.println("Temperature: F(" + fTemp + ")" + " C (" + cTemp + ")");
                uInput += 1;
                cSum += cTemp;
                fSum += fTemp;
                continue;
            }
        }

        keyboard.close();
    }
}
