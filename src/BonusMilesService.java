public class BonusMilesService {
    public int calculateBonus (int ticketPrice) {
        int price1mile = 20;
        int totalMile = ticketPrice / price1mile;
        return totalMile;
    }
}
