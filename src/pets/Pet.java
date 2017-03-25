package pets;

/**
 * Created by Hrant on 20.03.2017.
 */
public class Pet {
    protected String name;
    protected int age;
    protected String color;
    private boolean hungry;

    public Pet() {}

    public Pet(String name, int age, String color){
        this.name = name;
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

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }
}
