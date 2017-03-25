package clothes.womanClothes.downDresses;

/**
 * Created by Ashot on 3/21/2017.
 */
public class Skirt extends DownDress {
    public final String name = "skirt";

    public Skirt(String color){
        this.color = color;
    }

    public Skirt(String color, int price) {
        super(color, price);
    }
}
