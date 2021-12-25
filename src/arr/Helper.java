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

    // remove all odds
    public Integer[] removeOdd(){
        int even = 0;

        // determine how many evens you have
        for (int i = 0; i < this.arrayed.length; i++){
            if (this.arrayed[i] % 2 == 0){
                even++;
            }
        }

        Integer[] noOdds = new Integer[even];
        int index = 0;

        // add those
        for (int i = 0; i < this.arrayed.length; i++){
            if(this.arrayed[i] % 2 == 0){
                noOdds[index++] = this.arrayed[i];
            }
        }

        return noOdds;
    }

    // reverse it from an index to another
    public void reverseMe(int start, int end){
        while(start < end - 1){
            int temp = this.arrayed[end];
            this.arrayed[end] = this.arrayed[start];
            this.arrayed[start] = temp;
            start++;
            end--;
        }


    }
    public void display(){
        System.out.println(Arrays.toString(this.arrayed));
    }
}
