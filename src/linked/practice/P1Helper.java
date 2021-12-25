package linked.practice;

// keeping things really separate
public class P1Helper {
    P1Singly<Integer> simpleList;

    public P1Helper(){

    }

    // create a linked list of odd valued nodes
    public  void generateXOddNodes(int size){
       this.simpleList = new P1Singly<>();
        P1Random data = new P1Random();

        for (int i = 0; i < size; i++){
            // design patterns
            int actualData = data.generateRandom();

            if (actualData % 2 != 0)
                simpleList.addFirst(actualData);

            else
                simpleList.addFirst(actualData + 1);
        }
        simpleList.display();
    }

    // depending on 0 or 1 add at first or last
    public void addFirstOrLast(int size){
        this.simpleList = new P1Singly<>();

        for (int i = 0; i < size; i++){
            if(new P1Random().binary() == 0){
                this.simpleList.addFirst(new P1Random().generateRandom());
            }

            else
            {
                this.simpleList.addLast(-1 * new P1Random().generateRandom());

            }
        }

        this.simpleList.display();
    }

}
