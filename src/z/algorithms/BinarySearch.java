package z.algorithms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BinarySearch {

    public static int steps = 1;

    public static long binarySearch(long[] arr, long item){
        int low,mid,high;
        low = 0;
        high = arr.length - 1;

        while(low <= high){
            mid = ((low + high)/2);
            if(arr[mid] == item ){
                return mid;
            }
            else if(arr[mid] < item){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
            steps++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Random randomGen = new Random();
        Scanner sc = new Scanner(System.in);
        long item;
        long[] arr =  randomGen.longs(5).toArray();
        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("Array Element at position " + i + " is : " + arr[i]);
        }
        System.out.print("Please enter an item to search for in the above array : ");
        item = sc.nextLong();
        long result = binarySearch(arr,item);
        if(result == -1){
            System.out.print("Item not found");
        }
        else{
            System.out.print("Took " + steps + " step(s) and item found at index " + result);
        }


    }
}
