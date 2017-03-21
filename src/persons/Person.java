package persons;

import pets.cats.Cat;
import pets.dogs.Dog;

/**
 * Created by Hrant on 3/21/2017.
 */
public class Person {
    String firstName;
    String lastName;
    int age;
    String hairColor;
    String eyeColor;
    int height;
    int weight;
    Cat cat;
    Dog dog;

    public String toString(){
        return String.format("Man");
    }

    public void goOut(){
    }

    public void draw(){
        System.out.println(String.format("Name: %s %s", firstName, lastName));
        if(age != 0) System.out.println("Age: " + age);
        if(hairColor != null) System.out.println("Hair Color: " + hairColor);
        if(eyeColor != null) System.out.println("Eye Color: " + eyeColor);
        if(height != 0) System.out.println(" Height: " + height);
        if(weight != 0) System.out.println(" Weight: " + weight);
        if(hasPets()) {
            System.out.println("He has a " + ( (cat != null)? "cat" : "dog" ) );
            System.out.println("His pets name is " + ( (cat != null)? cat.getName() : dog.getName() ) );
        }

    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int age, String hairColor, String eyeColor){
        this(firstName, lastName);
        this.age = age;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public Person(String firstName, String lastName, int age, String hairColor, String eyeColor, int height, int weight){
        this(firstName, lastName, age, hairColor, eyeColor);
        this.height = height;
        this.weight = weight;
    }

    public boolean isDressed(){
        return true;
    }

    public boolean hasPets(){
        if(cat == null && dog == null) return false;
        else return true;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
