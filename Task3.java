
public class Task3 {
    public static void main(String[] args) {
        int zodiacNo = Integer.parseInt(System.console().readLine("Enter the Zodiac Number : "));

        switch(zodiacNo) {
            case 1 -> System.out.println(" Rat");
            case 2 -> System.out.println("Ox");
            case 3 -> System.out.println("Tiger");
            default -> System.out.println("Enter a valid value");
                
        }

        
    }
    
}
