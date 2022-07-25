//Program to remove repeating character
import java.util.*;
  class Main {
  public static void main(String[] args) {
    String str,newstr;
    newstr="";
    char ch;
    int i,j;
    System.out.println("Program to remove repeating character in a string");
    System.out.println("-------------------------------------------------");
    System.out.print("Enter a string: ");
    Scanner sc=new Scanner(System.in);
    str=sc.nextLine();
    sc.close();
    for(i=0;i<str.length();i++)
    {
      ch=str.charAt(i);
      if(str.indexOf(ch)==str.lastIndexOf(ch))
      {
        newstr=newstr+ch;
      }
    }
    System.out.println("New String: "+newstr);
  }
}
