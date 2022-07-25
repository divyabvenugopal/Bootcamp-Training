//Program to remove a particular character from a string
import java.util.*;
  class Main {
  public static void main(String[] args) {
    String s,newstr;
    newstr="";
    int i;
    char ch;
    System.out.println("Program to remove a particular character from a string");
    System.out.println("------------------------------------------------------");
    System.out.print("Enter a string: ");
    Scanner sc=new Scanner(System.in);
    s=sc.nextLine();
    System.out.print("Enter a character in the string that you want to remove: ");
    ch=sc.next().charAt(0);
    sc.close();
    if(s.indexOf(ch)>=0)
    {
      for(i=0;i<s.length();i++)
      {
        if(s.charAt(i)!=ch)
        {
          newstr=newstr+s.charAt(i);
        }
      }
      System.out.println("New String after removing the given character is: "+newstr);
    }
    else
    {
      System.out.println("The given character is not present in the given string");
    }
  }
}