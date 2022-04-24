package replit4;

public class MyClass {
    int count;

    public void myMethod(MyClass ref){
        ref.count++;
    }


    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        MyClass temp = myClass;

        myClass.count = 1;
        myClass.myMethod(temp);

        System.out.println(myClass.count);
    }

}