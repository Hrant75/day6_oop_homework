package clothes.manClothes.downDresses;

import clothes.manClothes.ManCloth;

/**
 * Created by Ashot on 3/21/2017.
 */
public class DownDress extends ManCloth {

    public DownDress() {
    }

    public DownDress(String color){
        this.color = color;
    }

    public DownDress(String color, int price) {
        super(color, price);
    }
}
