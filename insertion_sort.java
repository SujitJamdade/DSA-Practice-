package java_class;

public class insertion_sort {

    public static void printArray(int number[]){
        for (int i=0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr [] = {7,8,3,1,2};

        for (int i=1; i<arr.length;i++){
            int curr = arr[i];
            int j = i-1;
            while (j>=0 && curr < arr[j]){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        printArray(arr);

    }
}
