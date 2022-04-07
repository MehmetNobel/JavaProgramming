package tasks_statics_constructors;

public class Iphone {

    public String model,color,size;
    public double price;
    public static String madeIn, brand,OS;

    static {
        madeIn="China";
        brand="Apple";
        OS="IOS";

    }

    public Iphone(String model, String color, String size, double price) {
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public void faceTime(Long phoneNumber){

        System.out.println(model+" is now video-calling "+phoneNumber);

    }

    public void faceTime(String mail){

        System.out.println(model+" is now sending mail to "+mail);

    }

    public void call(Long phoneNumber){

        System.out.println(model+" is now calling mail to "+phoneNumber);

    }

    public void text(Long phoneNumber){

        System.out.println(model+" is now sending message to "+phoneNumber);

    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", madeIn=" + madeIn +
                ", brand=" + brand +
                ", OS=" + OS +
                '}';
    }
}

class Test6{

    public static void main(String[] args) {

        Iphone i1=new Iphone("11","black","medium",1125);

        System.out.println("i1 = " + i1);

        i1.call(546859422L);

        i1.faceTime("mehmet@gmail.com");

        i1.text(545485554l);

        i1.faceTime(54546565565l);




    }
}


/*
4. IPhone Task:
1. Creta a class named IPhone:
Attributes:
instance: model, price,
color, size
statics: brand, OS, madeIn
Add a constructor that can set All the
fields (instances)
Actions:
faceTime(long phoneNumber)
faceTime(String email)
call(long phoneNumber)
text(long phoneNumber)
toString()
 */