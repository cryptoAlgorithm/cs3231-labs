package lab.extra.one;

public class HandPhone{
    private static int numHandPhone = 0;
    //ATTRIBUTES
    private String brand;
    private String model;
    private final String productID;
    private double price;
    private double talkTime;
    private int weight;

    //CONSTRUCTORS
    public HandPhone(String b, String m, double p, double tt, int w){
        brand = b;
        model = m;
        price = p;
        talkTime = tt;
        weight = w;
        productID = ++numHandPhone + "-" + model;
    }

    public HandPhone(String b, String m, double p) {
        this(b, m, p, 180, 120);
    }

    public HandPhone(){ //constructor to give default values
        //update the code to use this() to invoke the 1st constructor above.
        this("Samsung", "S7", 599, 120, 145);
    }

    //ACCESSORS
    public double getTalktime(){
        return this.talkTime;
    }
    public int getWeight(){
        return this.weight;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public double getPrice(){
        return this.price;
    }

    // MUTATORS
    public void setTalktime(double tt){
        this.talkTime = tt;
    }
    public void setWeight(int wt){
        this.weight = wt;
    }
    public void setBrand(String b){
        this.brand = b;
    }

    public void setModel(String m){
        this.model = m;
    }
    public void setPrice(double p){
        this.price = p;
    }

    @Override
    public String toString(){
        return brand + " " + model + "\nProduct ID: " + productID
                + "\nTalk time: " + talkTime + "\nWeight: " + weight + "\nPrice: $" + price;
    }
}
