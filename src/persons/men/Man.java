package persons.men;

import clothes.manClothes.downDresses.DownDress;
import clothes.manClothes.hats.Hat;
import clothes.manClothes.shoes.Shoe;
import clothes.manClothes.topDresses.TopDress;
import persons.Person;

/**
 * Created by Hrant on 3/21/2017.
 */
public class Man extends Person {
    Shoe shoes;
    TopDress topDress;
    DownDress downDress;
    Hat hat;
    boolean hasTattoo;
    String   tattooColor;

    public Man(String firstName, String lastName){
        super(firstName, lastName);
    }

    public Man(String firstName, String lastName, int age, String hairColor, String eyeColor, int height, int weight){
        super(firstName, lastName, age, hairColor, eyeColor);
        this.setAge(age);
        this.setWeight(weight);
    }

    public void goOut(){
        if(shoes == null || topDress == null || downDress == null )
            System.out.println("Cannot go out naked");
        else
            System.out.println("I look great, going out");
    }

    public void draw(){
        super.draw();
        if(shoes != null) System.out.println("His shoes are " + shoes);
        if(downDress != null) System.out.println("His down dress is " + downDress);
        if(topDress != null) System.out.println("His top dress is " + topDress);
        if(hat != null) System.out.println("His hat is " + hat);
        if(hasTattoo) System.out.println("He has " + tattooColor + " tattoo");
    }

    public Shoe getShoes() {
        return shoes;
    }

    public TopDress getTopDress() {
        return topDress;
    }

    public DownDress getDownDress() {
        return downDress;
    }

    public Hat getHat() {
        return hat;
    }

    public boolean isHasTattoo() {
        return hasTattoo;
    }

    public String getTattooColor() {
        return tattooColor;
    }

    public void setShoes(Shoe shoes) {
        this.shoes = shoes;
    }

    public void setTopDress(TopDress topDress) {
        this.topDress = topDress;
    }

    public void setDownDress(DownDress downDress) {
        this.downDress = downDress;
    }

    public void setHat(Hat hat) {
        this.hat = hat;
    }

    public void setHasTattoo(boolean hasTattoo) {
        this.hasTattoo = hasTattoo;
    }

    public void setTattooColor(String tattooColor) {
        this.tattooColor = tattooColor;
    }
}
