package java_class;

public class bubble_sort {

    public static void printArray(int number[]){
        for (int i=0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
    }

    public static void main(String args[]){

        int number []= {7,8,3,1,2};

        //bubble sort
        for(int i=0; i<number.length-1;i++){
            for (int j=0; j<number.length-i-1; j++){

                if (number[j]>number[j+1]){
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
        }
        printArray(number);

    }
}
