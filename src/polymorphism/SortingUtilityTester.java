package polymorphism;

public class SortingUtilityTester {

    public static void main(String []args) {
        int []arr = new int[]{3,1,-5,6,2-4,0};

        SortingUtility.sort(arr, new AscendingComparator());
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
        SortingUtility.sort(arr, new DescendingComparator());
        for(int j : arr) System.out.print(j + " ");

    }
}
