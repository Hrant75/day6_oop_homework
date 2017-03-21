package pets;

/**
 * Created by Hrant on 20.03.2017.
 */
public class Pet {
    private String name;
    private int age;
    private String color;
    private boolean hungry;

    public Pet(String name){
        this.name = name;
    }

    public Pet(String name, Pet type, int age, String color){
        this(name);
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString(){
        return String.format("%n - $a years old %c", name, age, color);
    }

    public void makeSound(){}

    public boolean isHungry(){
        return hungry;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }
}
