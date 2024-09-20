package nopoly;

public class SortingUtilityTester {

//    private static void printData(char c) {
//        System.out.println("Character :" + c);
//    }

    private static void printData(int n) {
        System.out.println("Number : " + n);
    }

    private static void getMax(int a, int b) {
        System.out.println("max of 2 int: " + Math.max(a,b));
    }

    private static void getMax(long a, long b) {
        System.out.println("max of 2 long: " + Math.max(a,b));
    }

    public static  void  main(String []arg) {
//        int []arr = new int[]{3,1,-5,6,2-4,0};
//        SortingUtility.sort(arr, false);
//        for(int i = 0; i < arr.length; i++)
//            System.out.print(arr[i]+ " ");

        System.out.println("Example of compile time polymorphism achieved by method overloading");
        printData(9);
        printData('c'); //implicit conversion, another example of method overloading
        //printData(Integer.parseInt("c")); error - number format exception
        getMax(2L,9); //implicit conversion, type promotion

    }

}
