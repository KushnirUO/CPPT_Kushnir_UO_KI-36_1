package Ki36_Kushnir_Lab3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Dog {
    /**
     * new Leash
     */
    Leash leash;
    /**
     * new Overalls
     */
    Overalls overalls;
    /**
     * new Tail;
     */
    Tail tail;
    /**
     * new PrintWriter
     */
    PrintWriter printWriter;

    /**
     * Constructor
     */

    public Dog() {
        try {
            this.printWriter = new PrintWriter("Log.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Constructor
     * @param leash
     * @param overalls
     */
    public Dog(Leash leash, Overalls overalls) {
        this.leash = leash;
        this.overalls = overalls;
        try {
            this.printWriter = new PrintWriter("Log.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Constructor
     * @param leash
     * @param overalls
     * @param tail
     */
    public Dog(Leash leash, Overalls overalls, Tail tail) {
        this.leash = leash;
        this.overalls = overalls;
        this.tail = tail;
        try {
            this.printWriter = new PrintWriter("Log.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * Method for Wearing leash
     */
    public void WearLeash(){
        if(leash.isWearing() == false) {
            leash.setWearing(true);
            System.out.println("Wearing leash");
            printWriter.println("Wearing leash");
            printWriter.flush();
        }
    }

    /**
     * Method for Unwearing leash
     */
    public void UnWearLeash(){
        if(leash.isWearing() == true) {
            leash.setWearing(false);
            System.out.println("Unwearing leash");
            printWriter.println("Unwearing leash");
            printWriter.flush();
        }
    }

    /**
     * Method for Wearing overalls
     */
    public void WearOveralls(){
        if(overalls.isWearing() == false) {
            overalls.setWearing(true);
            System.out.println("Wearing overalls");
            printWriter.println("Wearing overalls");
            printWriter.flush();
        }
    }

    /**
     * Method for Un Wearing overalls
     */
    public void UnWearOveralls(){
        if(overalls.isWearing() == true) {
            overalls.setWearing(false);
            System.out.println("UnWearing overalls");
            printWriter.println("UnWearing overalls");
            printWriter.flush();
        }
    }

    /**
     * Method for waving tail
     */
    public void WaveTail(){
        if(tail.isWave() == false) {
            tail.setWave(true);
            System.out.println("Waving the tail");
            printWriter.println("Waving the tail");
            printWriter.flush();
        }
    }

    /**
     * Method for waving tail
     */
    public void UnWaveTail(){
        if(tail.isWave() == true) {
            tail.setWave(false);
            System.out.println("Un Waving the tail");
            printWriter.println("Un Waving the tail");
            printWriter.flush();
        }
    }

    /**
     * Method for barking
     */
    public void Bark(){
        System.out.println("Barking");
        printWriter.println("Barking");
        printWriter.flush();
    }

    /**
     * Method for whining
     */
    public void Whine(){
        System.out.println("Whining");
        printWriter.println("Whining");
        printWriter.flush();
    }

    /**
     * Method for sit down
     */
    public void SitDown(){
        System.out.println("Sitting down");
        printWriter.println("Sitting down");
        printWriter.flush();
    }

    /**
     * Method for giving a paw
     */
    public void GiveAPaw(){
        System.out.println("Giving a paw");
        printWriter.println("Giving a paw");
        printWriter.flush();
    }

    /**
     * Method to close file
     */
    public void closePrintWriter(){
        printWriter.println("Closing file");
        printWriter.flush();
        printWriter.close();
    }
}
