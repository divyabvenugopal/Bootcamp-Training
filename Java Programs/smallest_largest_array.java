//Program to find the smallest and largest element in an array
import java.util.*;
class Main {
  public static void main(String[] args) {
    int i,size;
    System.out.println("Program to find the smallest and largest element in an array");
    System.out.println("------------------------------------------------------------");
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter array size: ");
    size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter array elements: ");
    for(i=0;i<size;i++)
    {
      arr[i]=sc.nextInt();//Accept elements
    }
    sc.close();
    Arrays.sort(arr);
    System.out.println("Smallest element: "+arr[0]);
    System.out.println("Smallest element: "+arr[size-1]);
  }
}