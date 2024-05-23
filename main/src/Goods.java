public class Goods {
    //货物
    private String goodsName;
    private double price;
    private int quantity;
    private String number;
    private int year;
    private int month;
    private int day;

    //构造器


    public Goods(String goodsName, double price, int quantity, int year, int month, int day,String number) {
        this.goodsName = goodsName;
        this.price = price;
        this.quantity = quantity;
        this.year = year;
        this.month = month;
        this.day = day;
        this.number = number;
    }

    public Goods() {
    }

    //getter与setter
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
