import java.util.Scanner;

public class h2 {
  public static void main(String[] args){
    Scanner in= new Scanner(System.in);
    String a =in.nextLine();
    String b= in.nextLine();

    String res= "";


    
    for (int i=0;i<a.length();i++){
      char ch =a.charAt(i);
      boolean found =false;
      for (int j=0;j<b.length(); j++){
        if (ch==b.charAt(j)){
          found =true;
          break;
        }
      }
      if(!found){

        if(ch>= 'a'&& ch<= 'z'){
          res += (char)(ch-32);
        } else{
          res+= ch;
        }
      }
    }

    

    for (int i=0; i<b.length(); i++){
      char ch = b.charAt(i);
      boolean found = false;
      for (int j=0; j<a.length(); j++){
        if (ch == a.charAt(j)){
          found = true;
          break;
        }
      }
      if (!found){
        if (ch >= 'a'&& ch <='z'){
          res +=(char)(ch - 32);
        } else{
          res +=ch;
        }
      }
    }

    System.out.println(res);
  }
}
