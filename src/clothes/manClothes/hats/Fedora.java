package clothes.manClothes.hats;

/**
 * Created by Ashot on 3/21/2017.
 */
public class Fedora extends Hat {
    public final String name = "fedora";

    public Fedora(String color){
        this.color = color;
    }

    public Fedora(String color, int price) {
        super(color, price);
    }
}
