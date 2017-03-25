import clothes.manClothes.ManCloth;
import clothes.manClothes.downDresses.Jeans;
import clothes.manClothes.hats.Beret;
import clothes.manClothes.shoes.Boot;
import clothes.manClothes.topDresses.TShirt;
import clothes.womanClothes.WomanCloth;
import clothes.womanClothes.topDresses.Dress;
import clothes.womanClothes.topDresses.Jacket;
import persons.men.Man;
import pets.cats.Cat;
import shop.Shop;
import shop.WomanClothShop;

/**
 * Created by Hrant on 3/21/2017.
 */
public class Main {

    public static void main(String[] args) {
        Man man1 = new Man("Hrant", "Hayrapetyan");
        man1.setCat(new Cat("Piso", 3, "white"));

        man1.setEyeColor("brown");
        man1.setHairColor("light");
        man1.setHat(new Beret("black"));
        man1.setTopDress(new TShirt("white"));
        man1.setDownDress(new Jeans("blue"));
        man1.setShoes(new Boot("brown"));
        man1.draw();
        man1.goOut();

        System.out.println();

        Shop shop1 = new WomanClothShop();
        shop1.add5DifferentClothes();
        System.out.println(shop1.getSumOfShop());
        shop1.addCloth(new Dress("pink", 10000));
        System.out.println(shop1.getSumOfShop());

    }
}
