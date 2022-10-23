package Ki36_kushnir_Lab7;

public class Pasta implements Food {
    /**
     * price field
     **/
    private double price;
    /**
     * Shop field
     **/
    private String shop;
    /**
     * Size field
     **/
    private int size;

    /**
     * Constructor for Pasta
     *
     * @param price for object
     * @param size for object
     * @param shop for object
     **/
    public Pasta(double price, String shop, int size) {
        this.price = price;
        this.shop = shop;
        this.size = size;
    }

    /**
     * getter for shop field
     *
     * @return shop
     **/
    public String getShop() {
        return shop;
    }

    /**
     * setter for shop field
     *
     * @param shop for object
     **/
    public void setShop(String shop) {
        this.shop = shop;
    }

    /**
     * getter for size field
     *
     * @return size
     **/
    public int getSize() {
        return size;
    }

    /**
     * setter for size field
     *
     * @param size for object
     **/
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * overrided getter for price field
     *
     * @return price
     **/
    @Override
    public double getPrice() {
        return price;
    }

    /**
     * setter for price field
     *
     * @param price for object
     **/
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Overrided method toString() for Pants object
     **/
    @Override
    public void output() {
        System.out.println("Pasta{" +
                "price=" + price +
                ", shop ='" + shop + '\'' +
                ", size=" + size +
                '}');
    }

    /**
     * Overrided method compareTo() for Food object that compares objects ny its price
     *
     * @return int
     **/
    @Override
    public int compareTo(Food o) {
        Double pr = price;
        return pr.compareTo(o.getPrice());
    }

}
