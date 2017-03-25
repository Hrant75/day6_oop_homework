package clothes.womanClothes;

import clothes.Cloth;

/**
 * Created by Hrant on 20.03.2017.
 */
public class WomanCloth extends Cloth {
    public final String name = "WomanCloth";

    public WomanCloth() {
    }

    public WomanCloth(String color){
        this.color = color;
    }

    public WomanCloth(String color, int price) {
        super(color, price);
    }
}
