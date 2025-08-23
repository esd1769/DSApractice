import java.util.Scanner;

public class h3{
  public static void main(String[] args){
    Scanner in =new Scanner(System.in);
    String s= in.nextLine();

    String an="";
    boolean lo=true;
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
        if(lo){
          if (ch>='A'&&ch<='Z')ch=(char)(ch+32);
        } else {
          if (ch>='a'&&ch<='z')ch=(char)(ch-32);
        }
        an+=ch;
        lo=!lo;
      } else{
        an+=ch;
      }
    }
    System.out.println(an);
  }
}

