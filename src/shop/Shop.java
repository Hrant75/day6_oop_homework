package shop;

import clothes.Cloth;

/**
 * Created by Hrant on 25.03.2017.
 */
public class Shop {
    Cloth shop[] = new Cloth[1000];

    public int getSumOfShop(){
        int sum  = 0;
        for (Cloth cloth : shop)
            if(cloth != null) sum += cloth.getPrice();
        return sum;
    }

    protected boolean add(Cloth cloth, Cloth[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null) {
                array[i] = cloth;
                return true;
            }
        }
        return false;
    }
    public void add5DifferentClothes(){}

    public void addCloth(Cloth cloth){
    }
}
