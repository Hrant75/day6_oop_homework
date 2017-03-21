package pets.cats;

import pets.Pet;

/**
 * Created by Hrant on 20.03.2017.
 */
public class Cat extends Pet {
    public Cat(String name){
        super(name);
    }

    public void makeSound(){
        if(isHungry()) System.out.println("Meew-Meew");
        else System.out.println("Mrrrrrrrrr");
    }

    @Override
    public String toString(){
        return "cat";
    }
}
