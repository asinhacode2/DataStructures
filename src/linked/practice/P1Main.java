package linked.practice;

public class P1Main {

    public static void main(String[] args) {

        P1Helper help = new P1Helper();

        //help.generateXOddNodes(15);

        help.addFirstOrLast(15);
        help.simpleList.addAtPosition(5, -10000);
        help.simpleList.display();

    }


}
