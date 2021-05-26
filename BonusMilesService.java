public class BonusMilesService {
    public int calculateBonus(int ticketPrice) {
        int roublesPerMile = 20; //бонусных рублей за 1 милю
        int amountBonus = ticketPrice / roublesPerMile; //начислено бонусных миль

        return amountBonus;
    }
}
