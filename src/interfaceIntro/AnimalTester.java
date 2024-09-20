package interfaceIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalTester {

    public static void main(String[] args) {
        //Animal animal = new Animal();
//        Animal animal ;
//        animal = new Cat();
//        animal.move();
//        animal.speak();
//        animal = new Dog();
//        animal.move();
//        animal.speak();
//        System.out.println(" ");
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cat());
        animals.add(new Dog());
        AnimalUtility.makeNoise(animals);

        Animal a = new Cat();
        //a.attack();
        /**
         * compile time error as objects are created at runtime,
         * so compiler does not know which object is Animal interface referring to
         * it only knows about speak and move function
         *
         * We are allowed to call some method on a ref variable if ond only if class/interface
         * has the method inside it
         */

        Cat c = (Cat) a;
        c.attack();
        /**
         * compiler does not know what a is pointing to , so typeCast works during compile time
         */

        /**
         * Animal animal = new Dog();
         *  Cat cat = (Cat) animal;
         *  error as Dog cannot be cast to Cat
         */


        grazeAllNotGeneric(Arrays.asList(new Cat(), new Dog()));

        grazeAllGeneric(Arrays.asList(new Cat()));
    }

    public static void grazeAllNotGeneric(List<Animal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            Animal a = animals.get(i);
            if (a instanceof Cat) {
                Cat c = (Cat) a;
                c.attack();
            } else if (a instanceof Dog) {
                Dog d = (Dog) a;
                d.speak();
            }
        }
    }

        public static void grazeAllGeneric(List<Attackable> g) {
            for(int i=0;i<g.size();i++) {
                Attackable animal = g.get(i);
                animal.attack();
            }
    }
}

