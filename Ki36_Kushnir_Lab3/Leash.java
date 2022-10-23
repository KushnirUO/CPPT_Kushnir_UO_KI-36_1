package Ki36_Kushnir_Lab3;

public class Leash {
    private boolean isWearing;

    public Leash(){

    }

    public Leash(boolean isWearing) {
        this.isWearing = isWearing;
    }

    public boolean isWearing() {
        return isWearing;
    }

    public void setWearing(boolean wearing) {
        isWearing = wearing;
    }
}
