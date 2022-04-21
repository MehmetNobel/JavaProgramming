package inheritance.group;

public class Main {

    public static void main(String[] args) {

        Main main=new Main();
        main.start();


    }

    public void start() {

        String last = "Z";

        Container container = new Container();
        container.setInitial("C");
        another(container, last);
        System.out.println(container.getInitial());
    }

    private void another(Container initialHolder, String newInitial) {

        newInitial.toLowerCase();
        initialHolder.setInitial("B");
        Container inital2=new Container();
        initialHolder=inital2;
        System.out.print(initialHolder.getInitial());
        System.out.print(newInitial);


    }


}
