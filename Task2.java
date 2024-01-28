
public class Task2 {
    public static void main(String[] args) {
        float budget = Float.parseFloat(System.console().readLine("Enter your budget : " ));

        if (budget >=0 && budget <= 19) {
            System.out.println("Walk");

        } else if (budget >= 20 && budget <= 49) {
            System.out.println("Ride Bus");
        } else if (budget >= 50 && budget <= 100) {
            System.out.println("Ride train");
        } else {
            System.out.println("Ride a taxi");
        }

    }

}
