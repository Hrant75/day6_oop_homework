package clothes.womanClothes.topDresses;

/**
 * Created by Ashot on 3/21/2017.
 */
public class Blouse extends TopDress {
    public final String name = "blouse";

    public Blouse(String color){
        this.color = color;
    }

    public Blouse(String color, int price) {
        super(color, price);
    }
}
