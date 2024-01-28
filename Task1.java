public class Task1 {
    public static void main(String[] args) {
        int num = Integer.parseInt(System.console().readLine("Enter an integer number :"));

        if ((num % 3 == 0) || (num % 5 == 0)) {
            if ((num % 3 == 0) && (num % 5 == 0))
                System.out.println("and the number is divisible by 3 and 5");
            System.out.println("The number " + num + " is divisible by either 3 or 5");
        }


    }

}
