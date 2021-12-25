package arr;

import java.util.Arrays;

public class Helper {

    Integer[] arrayed ;

    public Helper(){
       this(5);
    }

    public Helper(int size){
        arrayed = new Integer[size];
    }

    public int generateNumber(){
        return (int)(Math.random() * 100);
    }

    public void addIt(){
        for (int i = 0; i < this.arrayed.length; i++){
            this.arrayed[i] = generateNumber();
        }
    }

    // remove even numbers from the array
    public Integer[] removeEven(){
        int odd = 0;

        for (int i = 0; i < this.arrayed.length; i++)
        {
            if(this.arrayed[i] % 2 != 0)
                odd++;
        }

        Integer[] evenRemoved = new Integer[odd];
        int index = 0;

        for (int i = 0; i < this.arrayed.length; i++)
        {
            if (this.arrayed[i] % 2 != 0)
            {
                evenRemoved[index++] = arrayed[i];
            }


        }

        return evenRemoved;
    }

    public void display(){
        System.out.println(Arrays.toString(this.arrayed));
    }
}
