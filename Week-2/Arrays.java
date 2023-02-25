/*package whatever //do not write package name here */
// Create a program that takes in a list of integers from the user
// and prints out the largest number in the list.

//package Arrays;
import java.util.*;

public class Arrays {
    public static void main (String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length=sc.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}