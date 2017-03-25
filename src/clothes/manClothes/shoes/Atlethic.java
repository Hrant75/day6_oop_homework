package clothes.manClothes.shoes;

/**
 * Created by Ashot on 3/21/2017.
 */
public class Atlethic extends Shoe {
    public final String name = "atlethic";

    public Atlethic(String color){
        this.color = color;
    }

    public Atlethic(String color, int price) {
        super(color, price);
    }
}
