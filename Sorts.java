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

/*
repeat (numOfElements - 1) times
  set the first unsorted element as the minimum
  for each of the unsorted elements
    if element < currentMinimum
      set element as new minimum
  swap minimum with first unsorted position
*/

  public static void selectionSort(int[] data){
    int temp = 0;
    int index = 0;
    for (int i = 0; i < data.length -1;i++){
      int sorted = i;
      for (int j = i+1; j< data.length; j++){
        if (data[j]<data[sorted]){
          sorted = j;
        }
      }
      temp = data[sorted];
      data[sorted] = data[i];
      data[i]=temp;
    }
  }


  public static void insertionSort(int[] data){
    int sorted = 0;
    int temp = 0;
    for (int i=1; i<data.length;i++){
      int curr = data[i];
      int j = i-1;
      while (j >= 0 && data[j]>curr){
        data[j+1] = data[j];
        j = j-1;
      }
      data[j+1] = curr;
    }
  }


}
