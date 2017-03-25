package persons.women;

import clothes.womanClothes.downDresses.DownDress;
import clothes.womanClothes.hats.Hat;
import clothes.womanClothes.shoes.Shoe;
import clothes.womanClothes.topDresses.TopDress;
import persons.Person;

/**
 * Created by Ashot on 3/21/2017.
 */
public class WoMan extends Person {

    private Shoe shoes;
    private TopDress topDress;
    private DownDress downDress;
    private Hat hat;
    private Boolean hasMakeup;
    private String lipstickColor;
    private Boolean hasEarrings;

    public WoMan(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public WoMan(String firstName, String lastName, int age, String hairColor, String eyeColor, int height, int weight){
        this(firstName, lastName);
        this.age = age;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.height = height;
        this.weight = weight;
    }

    public void goOut(){
        if(shoes != null || topDress != null || downDress == null )
            System.out.println("Cannot go out naked");
        else if(!hasMakeup) System.out.println("I will not go out without makeup");
        else
            System.out.println("I look great, going out");
    }

    public String toString() {
        return "Woman";
    }

    public void draw(){
        super.draw();
        if(shoes != null) System.out.println("Her shoes are" + shoes);
        if(downDress != null) System.out.println("Her down dress is" + downDress);
        if(topDress != null) System.out.println("Her top dress is" + topDress);
        if(hat != null) System.out.println("Her hat is" + hat);
        if(lipstickColor != null) System.out.println("Her lipstick color is " + lipstickColor);
        if(hasEarrings) System.out.println("She has earrings");
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

    public Boolean getHasMakeup() {
        return hasMakeup;
    }

    public String getLipstickColor() {
        return lipstickColor;
    }

    public Boolean getHasEarrings() {
        return hasEarrings;
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

    public void setHasMakeup(Boolean hasMakeup) {
        this.hasMakeup = hasMakeup;
    }

    public void setLipstickColor(String lipstickColor) {
        this.lipstickColor = lipstickColor;
    }

    public void setHasEarrings(Boolean hasEarrings) {
        this.hasEarrings = hasEarrings;
    }
}
