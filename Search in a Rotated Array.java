import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target=sc.nextInt();
        int[] arr = new int [n];
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(search(arr, target));
    }
    public static int search(int[] arr, int target) {
        int n = arr.length;
        int l = 0, r = n - 1;
        int mid;
        while(l <= r){
            mid = (l + r) / 2;
            if(arr[mid] > arr[r])
                l = mid + 1;
            else if(arr[mid] < arr[r]){
                r = mid;
            }
            else { // arr[mid] == arr[r] -> mid = r -> mid = l = r
                break;
            }
        }
        int minIndex = l;
        if(target >= arr[minIndex] && target <= arr[n - 1]){
            l = minIndex;
            r = n - 1;
        }
        else {
            l = 0;
            r = minIndex - 1;
        }
        // Apply Binary Search on updated range set by l and r
        return binarySearch(arr, l, r, target);
    }

    static int binarySearch(int arr[], int l, int r, int target){
        int mid;
        while(l <= r){
            mid = (l + r) / 2;
            if(arr[mid] > target){
                r = mid - 1;
            }
            if(arr[mid] < target){
                l = mid + 1;
            }
            if(arr[mid] == target)
                return mid;
        }
        return -1;
    }
}