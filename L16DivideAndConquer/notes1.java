//merge sorting for +ve and -ve values
package L16DivideAndConquer;

public class notes1 {

  //this function is only for printing the sorted arrays
  public static void printArr(int[] arr){
    for(int i=0; i< arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  //recursive function hai
  //si= Starting index and ei= ending index
  public static void mergeSorting(int[] arr, int si, int ei){
    //base case
    if(si >= ei){
      return;
    }
    int mid= si + (ei - si)/2;// we also calculate mid = (si+ei)/2
    mergeSorting(arr, si, mid);//left part
    mergeSorting(arr, mid+1, ei);//right part
    merge(arr, si, mid, ei);
  }

  
  //Step 3) to merge the mergeSort(left )+ mergeSort(Right)
  public static void merge(int arr[] , int si, int mid, int ei){
    //si(0, 3)=4 & ei(4, 6)=3 --> ei(6)- si(0)+1=7 that the total length of temp
    int[] temp = new int[ei - si +1];
    int i=si;//iterator for left part
    int j= mid+1;//iterator for right part
    int k=0;//iterator for temp array

    while(i <= mid && j <= ei){
      if(arr[i] < arr[j]){
        temp[k] = arr[i];
        i++;
        
      }
      else{
        temp[k]= arr[j];
        j++;
      }
      k++;
    }

    //left part me agr kuch bache huye elements hai to
    while(i <= mid){
      temp[k++]= arr[i++];
    }
    //right part me agr kuch  beche huye elements hai to
    while (j <= ei) {
      temp[k++]= arr[j++];
    }
    for(k =0, i=si; k<temp.length; k++, i++){
      arr[i]= temp[k];//isse temp ki value original i ke andr copy ho jayengi
    }

  }
  public static void main(String[] args) {
    int[] arr={6,3,9,5,2,8};
    mergeSorting(arr, 0, arr.length-1);
    printArr(arr);
  }
}
