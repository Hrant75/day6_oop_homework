package clothes.manClothes.shoes;

import clothes.manClothes.ManCloth;

/**
 * Created by Ashot on 3/21/2017.
 */
public class Shoe extends ManCloth {
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

