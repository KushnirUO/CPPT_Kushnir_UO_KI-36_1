package Ki36_Kushnir_Lab3;

public class Ki36_Kushnir_Lab3 {

    public static void main(String[] args) {
        Dog dog = new Dog(new Leash(false), new Overalls(false), new Tail(true));
        dog.Bark();
        dog.SitDown();
        dog.GiveAPaw();
        dog.WaveTail();
        dog.WearLeash();
        dog.WearOveralls();
    }
}
