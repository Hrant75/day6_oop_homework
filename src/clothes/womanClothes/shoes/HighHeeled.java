package clothes.womanClothes.shoes;

/**
 * Created by Ashot on 3/21/2017.
 */
public class HighHeeled extends Shoe {
    public final String name = "High Heeled";

    public HighHeeled(String color) {
        this.color = color;
    }

    public HighHeeled(String color, int price) {
        super(color, price);
    }
}
