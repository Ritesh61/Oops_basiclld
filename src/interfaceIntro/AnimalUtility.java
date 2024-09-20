package interfaceIntro;

import java.util.List;

public class AnimalUtility {
    public static void makeNoise(List<Animal> animals) {
        for(int i =0; i < animals.size(); i++)
            animals.get(i).speak();
        conclude();
    }

    private static void conclude() {
        System.out.println("conclude");
    }
}

/**
 * runtime polymorphism: call to a method is resolved at runtime, not compile time
 * method overloading: compile time poly as compiler is able to recognize
 * which function is getting called based on the argument passed
 */