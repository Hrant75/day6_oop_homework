package shop;

import clothes.Cloth;
import clothes.manClothes.ManCloth;
import clothes.manClothes.downDresses.Jeans;
import clothes.manClothes.hats.Beret;
import clothes.manClothes.hats.Cap;
import clothes.manClothes.topDresses.Shirt;

/**
 * Created by Hrant on 25.03.2017.
 */
public class ManClothShop extends Shop{

    public void add5DifferentClothes() {
        add(new Jeans("black", 7000), shop);
        add(new Jeans("blue", 8000), shop);
        add(new Shirt("white", 5000), shop);
        add(new Beret("brown", 5000), shop);
        add(new Cap("red", 5000), shop);
    }
    public void addCloth(Cloth cloth){
        add(cloth, shop);
    }

}
