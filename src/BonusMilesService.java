public class BonusMilesService {
    public int calculate(int price) {
        int oneMilesPrice = 20;// 1 миля за каждые 20 руб. в стоимости билета.
        return price * oneMilesPrice;

    }
}
