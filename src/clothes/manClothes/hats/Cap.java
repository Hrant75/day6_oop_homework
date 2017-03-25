package clothes.manClothes.hats;

/**
 * Created by Ashot on 3/21/2017.
 */
public class Cap extends Hat {
    public final String name = "cap";

    public Cap(String color){
        this.color = color;
    }

    public Cap(String color, int price) {
        super(color, price);
    }
}
