package clothes.womanClothes.shoes;

import clothes.womanClothes.WomanCloth;

/**
 * Created by Ashot on 3/21/2017.
 */
public class Shoe extends WomanCloth{
    public final String name = "Shoe";

    public Shoe() {
    }

    public Shoe(String color){
        this.color = color;
    }

    public Shoe(String color, int price) {
        super(color, price);
    }
}
