public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 10_000;
        int miles = service.calculateBonus(ticketPrice);
        System.out.println("Bonusmiles: " + miles);
    }
}