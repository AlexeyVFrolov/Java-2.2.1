import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BonusMilesService service = new BonusMilesService();
        System.out.print("Please, enter the ticket price in rubles ");
        long ticketPrice = (long) (in.nextDouble() * 100); // ticket price, kopecks
        System.out.println(String.format("Your free miles accrued: %s", service.calculate(ticketPrice)));
    }
}
