public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 2500;
        int miles = service.calculateBonus(ticketPrice);
        System.out.println("Начислено: " + miles + " бонусных миль");
    }
}