package Ki36_kushnir_Lab7;

/**
 * Main class for lab7
 *
 * @author Yulia Kushnir
 * @version 1.0.0
 **/
public class Ki36_Kushnir_Lab7 {
    /**
     * main method for Ki36_Kushnir_Lab7
     *
     * @param args for main method
     **/
    public static void main(String[] args) {
        Package<? super Food> safe = new Package<Food>();
        safe.AddFood(new Water(20, "Blizenko"));
        safe.AddFood(new Water(19, "Arsen"));
        safe.AddFood(new Water(26, "Silpo"));
        safe.AddFood(new Pasta(60, "Rukavichka", 30));
        safe.AddFood(new Pasta(80, "Arsen", 35));
        safe.AddFood(new Pasta(50, "Silpo", 25));


        Food res = safe.findMax();
        System.out.println("The most expensive :");
        res.output();

    }

}

