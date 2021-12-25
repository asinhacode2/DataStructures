package arr;

import java.util.Arrays;

public class Start {

    public static void main(String[] args) {
        Helper some = new Helper(15);
        some.addIt();
        some.display();

        //System.out.println(Arrays.toString(some.removeEven()));

        //System.out.println(Arrays.toString(some.removeOdd()));

        some.reverseMe(0,some.arrayed.length-1);
        some.display();
    }
}
