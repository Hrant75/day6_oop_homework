package clothes.womanClothes.hats;

import clothes.womanClothes.WomanCloth;

/**
 * Created by Ashot on 3/21/2017.
 */
public class Hat extends WomanCloth{
    public final String name = "hat";

    public Hat(String color){
        this.color = color;
    }

    public Hat(String color, int price) {
        super(color, price);
    }
}
