package clothes.womanClothes.topDresses;

/**
 * Created by Ashot on 3/21/2017.
 */
public class Dress extends TopDress {
    public final String name = "dress";

    public Dress(String color){
        this.color = color;
    }

    public Dress(String color, int price) {
        super(color, price);
    }
}
