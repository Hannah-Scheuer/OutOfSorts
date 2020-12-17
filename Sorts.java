public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int temp = 0;
    int swaps = 0;
    for (int i = 0; i<data.length-1;i++){
      swaps = 0;
      for (int j = 0; j<data.length-i-1;j++){
        if(data[j]>data[j+1]){
          temp = data[j];
          data[j] = data[j + 1];
          data[j + 1] = temp;
          swaps +=1;
        }
      }

      if (swaps==0){
        i = data.length;
      }
    }
  }


}
