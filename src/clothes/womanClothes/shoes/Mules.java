package clothes.womanClothes.shoes;

/**
 * Created by Ashot on 3/21/2017.
 */
public class Mules extends Shoe {
    public final String name = "mules";

    public Mules(String color){
        this.color = color;
    }

    public Mules(String color, int price) {
        super(color, price);
    }
}
