package Generics.Exercise;

import java.util.ArrayList;

/**
 * @Author
 * @Date 2024/9/6 17:18
 * @Description:
 */
public class App {
    public static void main(String[] args) {
        ArrayList<LiHuaCat> list1 = new ArrayList<>();
        ArrayList<TeddyDog> list2 = new ArrayList<>();
        ArrayList<HuskyDog> list3 = new ArrayList<>();
        LiHuaCat liHuaCat = new LiHuaCat();
        liHuaCat.setAge(1);
        liHuaCat.setName("狸花猫");
        list1.add(liHuaCat);
        keepPet(list1);
//        keepPet1(list1);
        keepPet2(list1);

        keepPet1(list2);
        keepPet1(list3);
    }

    public static void keepPet(ArrayList<? extends Cat> list) {
        for (Cat cat : list) {
            cat.eat();
        }
    }

    public static void keepPet1(ArrayList<? extends Dog> list) {
        for (Dog dog : list) {
            dog.eat();
        }
    }

    public static void keepPet2(ArrayList<? extends Animal> list) {
        for (Animal animal : list) {
            animal.eat();
        }
    }
}
