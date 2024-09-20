package stacks;
public class Student {
    private String email;
    private char section;
    private int age;

    public Student(String email, char section) {
        this.email =  email;
        this.section = section;
    }

    public Student(String email, char section, int age) {
        this(email, section);
        this.age = age;
    }


    public void printHashCode() {
        System.out.print(this);
        System.out.print(" ");
    }

    public Student getModifiedStudent(String email, char section, int age) {
        this.email =  email;
        this.section = section;
        this.age = age;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getEmail() {
        return this.email;
    }

    public char getSection() {
        return this.section;
    }

    public int getAge() {
        return this.age;
    }
}
