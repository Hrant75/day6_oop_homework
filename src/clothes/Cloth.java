package clothes;

/**
 * Created by Hrant on 20.03.2017.
 */
public class Cloth {
    private String name;
    private String material;
    private String color;

    public Cloth(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
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
