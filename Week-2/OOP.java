/*package whatever //do not write package name here */
// Create a program that takes in a list of integers from the user 
// and prints out the largest number in the list.


import java.util.*;

class Rectangle{
    int length;
    int width;
    Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    public int calculateArea(){
        return length*width;
    }
}
class GFG {
    public static void main (String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the area of rectangle");
        int length=sc.nextInt();
        int width=sc.nextInt();

        Rectangle rectangleObj=new Rectangle(length,width);
        System.out.println(rectangleObj.calculateArea());
    }
}