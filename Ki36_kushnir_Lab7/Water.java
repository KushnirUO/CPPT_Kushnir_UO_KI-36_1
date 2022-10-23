package Ki36_kushnir_Lab7;

public class Water implements Food {
    /**
     * price field
     **/
    private double price;
    /**
     * Shop field
     **/
    private String shop;

    /**
     * Constructor for Water
     *
     * @param price for object
     * @param shop for object
     **/
    public Water(double price, String shop) {
        this.price = price;
        this.shop = shop;
    }

    /**
     * override getter for price field
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
     * getter for Shop field
     *
     * @return shop
     **/
    public String getShop() {
        return shop;
    }

    /**
     * setter for Shop field
     *
     * @param shop for object
     **/
    public void setShop(String shop) {
        this.shop = shop;
    }

    /**
     * Override method toString() for T-Shirt object
     **/
    @Override
    public void output() {
        System.out.println("Water{" +
                "price=" + price +
                ", Shop= '" + shop + '\'' +
                '}');
    }

    /**
     * Override method compareTo() for Water object that compares objects ny its price
     *
     * @return -1,0 or 1 after comparing
     **/
    @Override
    public int compareTo(Food o) {
        Double pr = price;
        return pr.compareTo(o.getPrice());
    }



}
