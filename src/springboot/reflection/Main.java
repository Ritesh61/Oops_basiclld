package springboot.reflection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //print the dependency graph of Vehicle
    // o(me) -> Vehicle.class(Jvm created this) -> Class.class
    //loop-back feature : nocody created an object of Class
    public static void main(String[] args) {
        Object o = new Vehicle(new Motor(new Tube()), new GasChamber());
        System.out.println(o.getClass().getName());
        System.out.println(o.getClass().getClass().getName());
        System.out.println(o.getClass().getClass().getClass().getName());
        List<String> ans = getDependency(o);
        for(String i : ans) {
            System.out.println(i);
        }
    }

    public static List<String> getDependency(Object obj) {
        Class c = obj.getClass();
        List<String> dependencies = new ArrayList<>();

        DFS(dependencies, c);
        return dependencies;
    }

    private static void DFS(List<String> dependencies, Class curr) {
        dependencies.add(curr.getName());
        Field[] fields = curr.getDeclaredFields();
        for(Field f: fields) {
            DFS(dependencies, f.getType());
        }
    }


}
