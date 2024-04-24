public class BonusMilesService {
    public int calculate(int price) {
        int miles;
        if (price > 10_000) {
            miles = 500;
        } else {
            miles = price / 20;
        }

        return miles;
    }
}