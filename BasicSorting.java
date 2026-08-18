import java.util.*;
public class BasicSorting {
  public static void  bubbleSort(int [] arr){
      for(int turn =0; turn<arr.length-1; turn++){
          for(int j =0; j<arr.length-1-turn; j++){
              if(arr[j] > arr[j+1]){

                  // swapping ---
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
              }
          }
      }
  }
   public static void printArr(int []arr){
      for(int i=0; i<arr.length; i++){
          System.out.print(arr[i]+" ");
      }
       System.out.println();
   }

    public static void main(String[] args) {
        int [] arr = {3,6,2,1,8,7,4,5,3,1};
        bubbleSort(arr);
        printArr(arr);
    }
}