package clothes;

/**
 * Created by Hrant on 20.03.2017.
 */
public class Cloth {
    public final String name = "Cloth";
    private String material;
    protected String color;

    public Cloth() {}

    public Cloth(String color) {
        this.color = color;
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

    @Override
    public String toString(){
        return color + " " + ( (material != null)? material+" ": "") + name;
    }
}
