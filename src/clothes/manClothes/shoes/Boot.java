package clothes.manClothes.shoes;

/**
 * Created by Ashot on 3/21/2017.
 */
public class Boot extends Shoe {
    public final String name = "boot";

    public Boot(String color){
        this.color = color;
    }

    public Boot(String color, int price) {
        super(color, price);
    }
}
