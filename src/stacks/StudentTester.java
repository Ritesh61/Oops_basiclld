package stacks;

import java.util.Date;

public class StudentTester {
    
    public static void main(String[] args) {
        Student s1 = new Student("abc@yahoo.com", 'A', 20);
        Student s2 = new Student("abc@yahoo.com", 'A', 20);
        System.out.println(s1 + " " + s2);
        s1.printHashCode();
        s2.printHashCode();
        System.out.println(s1.getModifiedStudent("abcnew@yahoo.com", 'A', 20).getEmail());

        /**
         * however s1 , s2 have same values but they are pointing to a
         * different object in heap
         * every object will have its unique hashcode
         *this keyword can used for invocation of a constructor
         * pass current object as a parameter with using this
         * can also return the current object using this
         */

        /**
         * primitive data types not defined by user
         */
        final int x=2;
        final double y =9.0;
        final char c = 'a';
        /**
         * non-primitive data types / objects - user defined
         * date is a pointer not an object so adding final makes the pointer
         * unchangeable but not the content inside the object
         * variable names is not actually the object but pointer to that object
         * so cant change the address which that pointer is pointing to but
         * can change the contents pointer by it
         * date=M;
         * date=M' error
         */
        final Date date =  new Date();
        System.out.println(date.getTime());
        date.setTime(1000);
        System.out.println(date.getTime());

        Date date1 = new Date(10);
        date1 = new Date(15);
        /**
         * creating another object in the heap space and
        * changing the pointer of date1 from suppose M to M'
         *
         * final Date date1 = new Date(10);  date1 = new Date(15);
         *  The above line would give error
         *
         */


    }
}