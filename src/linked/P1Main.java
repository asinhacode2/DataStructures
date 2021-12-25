package linked;

public class P1Main {

    public static void main(String[] args) {

        generateXOddNodes(15);
        addFirstOrLast(15);
    }

    public static void generateXOddNodes(int size){
        P1Singly<Integer> odds = new P1Singly<>();
        P1Helper data = new P1Helper();

        for (int i = 0; i < size; i++){
            // design patterns
            int actualData = data.generateRandom();

            if (actualData % 2 != 0)
                odds.addFirst(actualData);

            else
                odds.addFirst(actualData + 1);
        }
        odds.display();
    }

    // depending on 0 or 1 add at first or last
    public static void addFirstOrLast(int size){
        P1Singly<Integer> linedUp = new P1Singly<>();

        for (int i = 0; i < size; i++){
            if(new P1Helper().binary() == 0){
                linedUp.addFirst(new P1Helper().generateRandom());
            }

            else
            {
                linedUp.addLast(-1 * new P1Helper().generateRandom());

            }
        }

        linedUp.display();
    }

}
