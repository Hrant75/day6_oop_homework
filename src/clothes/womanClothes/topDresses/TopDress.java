package clothes.womanClothes.topDresses;

import clothes.womanClothes.WomanCloth;

/**
 * Created by Ashot on 3/21/2017.
 */
public class TopDress extends WomanCloth {
    public final String name = "WomanCloth";

    public TopDress() {
    }

    public TopDress(String color){
        this.color = color;
    }

    public TopDress(String color, int price) {
        super(color, price);
    }
}
