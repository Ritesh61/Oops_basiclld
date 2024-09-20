package stacks;

public class Stack {

    private int[] arr;
    private int top;

    public Stack(int[] a)  {
        this.arr = new int[1000];
        for(int i=0;i<a.length; i++)
            arr[i]=a[i];
        this.top = a.length - 1;
    }

    public Stack()  {
        this.arr = new int[1000];
        this.top = - 1;
    }

    public Stack(Stack s) {
        this.arr = s.arr;
        this.top = s.top;
    }

    public void push(int x) {
        if(top == 1000) {
            System.out.println("Space limit reached so not able to push");
        } else {
            top++;
            arr[top] = x;
            System.out.println(x+ " Pushed successfully");
        }
    }

    public void pop() {
        if(top == -1)
            System.out.println("Cannot pop out as list is empty");
        else  {
            //arr[top] = 0;
            top--;
        }
    }
}

/**
 Default Constructor: No args
 Const overloading
 copy constructor
 */
