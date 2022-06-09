package June2022;

public enum Fruits {
    Mango(150), Banana(50), Apple(120), Orange;
    int price;
    Fruits(int price)
    {
        this.price= price;
    }
    Fruits(){
        this.price= 80;
    }
    public int getprice()
    {
        return price;
    }
}
