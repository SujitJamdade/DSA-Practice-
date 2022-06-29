package java_class;

public class selection_sort {

    public static void main(String args[]){

        int number[] = {7,8,3,1,2};



        for (int i=0; i<number.length; i++){
            int small = i;
            for (int j=i+1;j<number.length;j++){
                if (number[i]>number[j]){
                    int temp = number[j];
                    number[j]=number[i];
                    number[i] = temp;
                }
            }
        }

        for (int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
}
