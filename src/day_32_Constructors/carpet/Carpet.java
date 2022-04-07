package day_32_Constructors.carpet;

public class Carpet {

        public double width, length, unitPrice;

        public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){

        double price=0;

        if(isPersian==true)
            price=(unitPrice*width*length)+200;
        else
            price=(unitPrice*width*length);

        return price;

    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice= $" + calcCost() +
                '}';
    }
}
