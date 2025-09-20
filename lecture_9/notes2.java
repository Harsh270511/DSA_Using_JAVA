

// public class notes2 {

//   public static void SelectionSort1(int[] arr) {
//     // outer loop

//     for (int turn = 0; turn < arr.length - 1; turn++) {
//       // smaller value initialise

//       int minPosition = turn;

//       // inner loop
//       for (int i = turn + 1; i < arr.length; i++) {
//         if (arr[minPosition] > arr[i]) {
//           minPosition = i;
//         }
//       }
//       // swapping
//       int temp = arr[minPosition];
//       arr[turn] = arr[minPosition];
//       arr[minPosition] = temp;
//     }
//   }
//   public static void printArr(int num[]){
//     for(int j=0; j< num.length ; j++){
//       System.out.println(num[j]);

//     }
//   }

//   public static void main(String[] args) {
//     int[] arr = { 5, 4, 1, 3, 2 };
//     SelectionSort1(arr);
//     printArr(arr);
//   }

// }
