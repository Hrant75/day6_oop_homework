package clothes.womanClothes.shoes;

/**
 * Created by Ashot on 3/21/2017.
 */
public class Athletic extends Shoe {
    public final String name = "athletic";

    public Athletic(String color){
        this.color = color;
    }

    public Athletic(String color, int price) {
        super(color, price);
    }
}
