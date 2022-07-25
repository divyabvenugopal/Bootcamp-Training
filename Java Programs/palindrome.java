//Program to check whether a string is a palindrome or not
import java.util.*;
  class Main {
  public static void main(String[] args) {
    String s,rev;
    rev="";
    int i;
    System.out.println("Program to check whether a string is a palindrome or not");
    System.out.println("--------------------------------------------------------");
    System.out.print("Enter a string: ");
    Scanner sc=new Scanner(System.in);
    s=sc.nextLine();
    sc.close();
    for(i=s.length()-1;i>=0;i--)
    {
      rev=rev+s.charAt(i);
    }
    if(s.equalsIgnoreCase(rev))
    {
      System.out.println("Palindrome");
    }
    else
    {
      System.out.println("Not Palindrome");
    }
  }
}