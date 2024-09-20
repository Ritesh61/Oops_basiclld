package polymorphism;

public class AscendingComparator implements Comparator{
    @Override
    public boolean compare(int a, int b) {
        return a <= b;
    }
}
