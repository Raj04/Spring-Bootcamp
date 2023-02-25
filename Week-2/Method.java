/*package whatever //do not write package name here */
// Create a program that takes in a list of integers from the user
// and prints out the largest number in the list.


import java.util.*;

class Method {
    public static void main (String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the array");
        char ch[]={'a','e','i','o','u'};
        String str=sc.next();
        int vowelCount=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'
                    ||str.charAt(i)=='i'||str.charAt(i)=='o'
                    ||str.charAt(i)=='u'){
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
    }
}