import java.util.Scanner;

public class h4{
  public static void main(String[] args){
    Scanner in =new Scanner(System.in);
    String p= in.nextLine();

    boolean up=false,lo=false,di=false,sp=false;
    for(int i=0;i<p.length();i++){
      char ch= p.charAt(i);
      if (ch>='A'&&ch<='Z')up=true;
      else if(ch>='a'&&ch<='z') lo=true;
      else if (ch>='0'&&ch<='9')di=true;
      else if(ch!=' ') sp=true;
    }
    if (p.length()>=8&& up && lo &&di &&sp) 
      System.out.println("True");
    else 
      System.out.println("False");
  }
}
