package linked.practice;

public class P1Random {
    public P1Random(){

    }

    // a number between 0 and 99 inclusive
    public int generateRandom(){
        return (int)(Math.random() * 100);
    }

    // generates 0 or 1 to add at the front or the back
    public int binary(){
        return (int)(Math.random() * 2);
    }
}
