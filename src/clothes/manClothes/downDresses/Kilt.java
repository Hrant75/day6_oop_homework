package clothes.manClothes.downDresses;

/**
 * Created by Ashot on 3/21/2017.
 */
public class Kilt extends DownDress {
    public final String name = "kilt";

    public Kilt(String color){
        this.color = color;
    }

    public Kilt(String color, int price) {
        super(color, price);
    }
}
