package Ki36_Kushnir_Lab4;

public class ExperimentalDog extends Dog implements Experimental{

    /**
     * Constructor
     */
    public ExperimentalDog() {
    }

    /**
     * Constructor
     * @param leash
     * @param overalls
     */
    public ExperimentalDog(Leash leash, Overalls overalls) {
        super(leash, overalls);
    }

    /**
     * Constructor
     * @param leash
     * @param overalls
     * @param tail
     */
    public ExperimentalDog(Leash leash, Overalls overalls, Tail tail) {
        super(leash, overalls, tail);
    }

    /**
     * Implementing method that Experimenting
     */
    @Override
    public void Experiment() {
        System.out.println("Experimenting");
        printWriter.println("Experimenting");
        printWriter.flush();
    }
}
