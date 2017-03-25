package clothes;

/**
 * Created by Hrant on 20.03.2017.
 */
public class Cloth {
    public final String name = "Cloth";
    private String material;
    protected String color;
    protected int price;

    public Cloth() {}

    public Cloth(String color) {
        this.color = color;
    }

    public Cloth(String color, int price) {
        this.color = color;
        this.price = price;
    }


    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {        return price;    }

    @Override
    public String toString(){
        return color + " " + ( (material != null)? material+" ": "") + name;
    }
}
