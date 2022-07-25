//Program to count ocuurences of a particular character from a string
import java.util.*;
  class Main {
  public static void main(String[] args) {
    String s;
    int i,count;
    count = 0;
    char ch;
    System.out.println("Program to count ocuurences of a particular character from a string");
    System.out.println("-------------------------------------------------------------------");
    System.out.print("Enter a string: ");
    Scanner sc=new Scanner(System.in);
    s=sc.nextLine();
    System.out.print("Enter a character in the string: ");
    ch=sc.next().charAt(0);
    sc.close();
    if(s.indexOf(ch)>=0)
    {
      for(i=0;i<s.length();i++)
      {
        if(s.charAt(i)==ch)
        {
          count++;
        }
      }
      System.out.println("The count of occurences of the given character is: "+count);
    }
    else
    {
      System.out.println("The given character is not present in the given string");
    }
  }
}