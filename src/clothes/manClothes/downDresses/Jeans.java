package clothes.manClothes.downDresses;

/**
 * Created by Hrant on 21.03.2017.
 */
public class Jeans extends DownDress {
    public final String name = "jeans";

    public Jeans(String color){
        this.color = color;
    }

    public Jeans(String color, int price) {
        super(color, price);
    }
}
