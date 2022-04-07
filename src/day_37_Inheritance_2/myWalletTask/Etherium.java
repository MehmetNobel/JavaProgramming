package day_37_Inheritance_2.myWalletTask;

public class Etherium extends CryptoToken{

    public Etherium(double price, double marketCap, double volume, int quantity, int circulatingSupply, boolean isMineable) {
        super(price, marketCap, volume, quantity, circulatingSupply, isMineable);
    }

    @Override
    public String toString() {
        return "Etherium{" +
                "price=" + price +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", quantity=" + quantity +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }
}
