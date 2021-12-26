package linked.practice;

public class P1Main {

    public static void main(String[] args) {

        P1Helper help = new P1Helper();

        //help.generateXOddNodes(15);

        help.addFirstOrLast(7);
//        help.simpleList.addAtPosition(5, -10000);
//        help.simpleList.display();
//
//        help.simpleList.removeFirst();
//        help.simpleList.removeFirst();
//        help.simpleList.removeFirst();
//        help.simpleList.removeFirst();
//        help.simpleList.display();


//        help.simpleList.removeFirst();
//        help.simpleList.removeFirst();
//        help.simpleList.removeFirst();
//
//        help.simpleList.removeLast();
//        help.simpleList.removeLast();
//        help.simpleList.removeLast();
//
//        System.out.println(help.simpleList.getLast());

        help.simpleList.deleteFromPosition(5);
        help.simpleList.deleteFromPosition(1);
        help.simpleList.deleteFromPosition(help.simpleList.getSize());

        help.simpleList.display();


    }


}
