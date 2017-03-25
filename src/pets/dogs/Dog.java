package pets.dogs;

import pets.Pet;

/**
 * Created by Hrant on 20.03.2017.
 */
public class Dog extends Pet {

    public Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void makeSound(){
        if(isHungry()) System.out.println("Wow-Wow!");
        else System.out.println(":-)");
    }

    @Override
    public String toString(){
        return "dog";
    }
}
