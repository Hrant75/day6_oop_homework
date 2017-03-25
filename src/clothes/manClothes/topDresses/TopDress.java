package clothes.manClothes.topDresses;

import clothes.manClothes.ManCloth;

/**
 * Created by Ashot on 3/21/2017.
 */
public class TopDress extends ManCloth {
    public final String name = "TopDress";

    public TopDress() {
    }

    public TopDress(String color){
        this.color = color;
    }

    public TopDress(String color, int price) {
        super(color, price);
    }
}
