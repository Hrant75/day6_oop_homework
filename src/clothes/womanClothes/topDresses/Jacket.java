package clothes.womanClothes.topDresses;

/**
 * Created by Ashot on 3/21/2017.
 */
public class Jacket extends TopDress {
    public final String name = "jacket";

    public Jacket(String color){
        this.color = color;
    }

    public Jacket(String color, int price) {
        super(color, price);
    }


}
