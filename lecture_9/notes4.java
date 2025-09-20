
// public class notes4 {
//   public static void Insertion(int arr[]) {

//     // outer loop
//     for (int i = 1; i < arr.length; i++) {

//       int curr = arr[i];// current element
//       int prev = i - 1; // preivous element, index will be zero in first case

//       // finding the correct position of the element
//       while (prev >= 0 && arr[prev] > curr) {
//         arr[prev + 1] = arr[prev];
//         prev--;
//       }
//       // final insertion
//       arr[prev + 1] = curr;
//     }
//   }

//   public static void printArr(int[] nums) {
//     for (int j = 0; j < nums.length; j++) {
//       System.out.print(nums[j] + " ");
//     }
//   }

//   public static void main(String[] args) {
//     int[] arr = { 5, 4, 3, 7, 4, 2, 23, 775, 90 };
//     Insertion(arr);
//     printArr(arr);
//   }
// }