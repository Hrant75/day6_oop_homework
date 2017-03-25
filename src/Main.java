import clothes.manClothes.downDresses.Jeans;
import clothes.manClothes.hats.Beret;
import clothes.manClothes.shoes.Boot;
import clothes.manClothes.topDresses.TShirt;
import persons.men.Man;
import pets.cats.Cat;

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
    }
}
