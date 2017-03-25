package shop;

import clothes.Cloth;
import clothes.womanClothes.WomanCloth;
import clothes.womanClothes.downDresses.Skirt;
import clothes.womanClothes.shoes.Athletic;
import clothes.womanClothes.shoes.Mules;
import clothes.womanClothes.topDresses.Blouse;
import clothes.womanClothes.topDresses.Jacket;

/**
 * Created by Hrant on 25.03.2017.
 */
public class WomanClothShop extends Shop {

    public void add5DifferentClothes() {
        add(new Blouse("black", 7000), shop);
        add(new Skirt("blue", 8000), shop);
        add(new Athletic("white", 5000), shop);
        add(new Mules("brown", 5000), shop);
        add(new Jacket("red", 5000), shop);
    }

    public void addCloth(Cloth cloth){
        add(cloth, shop);
    }

}
