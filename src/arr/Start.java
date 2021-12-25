package arr;

import java.util.Arrays;

public class Start {

    public static void main(String[] args) {
        Helper some = new Helper(10);
        some.addIt();
        some.display();
        System.out.println(Arrays.toString(some.removeEven()));
    }
}
