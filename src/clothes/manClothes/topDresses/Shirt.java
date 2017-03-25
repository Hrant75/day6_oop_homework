package clothes.manClothes.topDresses;

/**
 * Created by Ashot on 3/21/2017.
 */
public class Shirt extends TopDress {
    public final String name = "shirt";

    public Shirt(String color){
        this.color = color;
    }

    public Shirt(String color, int price) {
        super(color, price);
    }
}
