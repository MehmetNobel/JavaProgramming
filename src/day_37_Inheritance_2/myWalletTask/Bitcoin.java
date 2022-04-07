package day_37_Inheritance_2.myWalletTask;

public class Bitcoin extends CryptoToken{

    public Bitcoin(double price, double marketCap, double volume, int quantity, int circulatingSupply, boolean isMineable) {
        super(price, marketCap, volume, quantity, circulatingSupply, isMineable);
    }

    @Override
    public String toString() {
        return "Bitcoin{" +
                "price=" + price +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", quantity=" + quantity +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }
}
