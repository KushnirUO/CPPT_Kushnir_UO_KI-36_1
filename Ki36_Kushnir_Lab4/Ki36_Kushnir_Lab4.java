package Ki36_Kushnir_Lab4;

/**
 * Ki36_Kushnir_Lab4 class implements main method
 * @author Yulia Kushnir
 * @version 1.0
 */
public class Ki36_Kushnir_Lab4 {

    public static void main(String[] args) {
        ExperimentalDog dog = new ExperimentalDog(new Leash(false), new Overalls(false), new Tail(true));
        dog.Bark();
        dog.SitDown();
        dog.GiveAPaw();
        dog.WaveTail();
        dog.WearLeash();
        dog.WearOveralls();
        dog.Experiment();
    }
}
