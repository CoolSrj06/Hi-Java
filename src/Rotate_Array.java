import java.util.Arrays;

public class Rotate_Array {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int d = 2;  // Change the value of d as needed
            int n = arr.length;

            rotateArr(arr, d, n);
        }

    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr,int start,int end){
            while (start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
    }
}

/*
Let's break down the rotateArr function step by step:

d = d%n;: This line ensures that if the rotation count d is greater than or equal
 to the length of the array n, it wraps around to the beginning. This is done to
  avoid unnecessary rotations and to bring d within the range of array indices.

reverseArray(arr,0,d-1);: This line reverses the first part of the array from
 index 0 to d-1. This effectively puts the last d elements at the beginning of the array.

reverseArray(arr,d,n-1);: This line reverses the remaining part of the array
 from index d to n-1. Now, the first n-d elements are also reversed.

reverseArray(arr,0,n-1);: Finally, this line reverses the entire array.
The effect of the previous two reversals is that the first n-d elements are now at the end of the array,
and the last d elements are at the beginning. This achieves the desired rotation.

The reverseArray function is a simple utility function that reverses
 a portion of the array specified by the start and end indices using a two-pointer approach.

In summary, the code rotates the array in three steps: first,
it reverses the initial part of the array, then it reverses the remaining part,
and finally, it reverses the entire array to achieve the desired rotation.
 */
