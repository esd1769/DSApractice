import java.util.Scanner;

public class h1 {
  public static void main(String[] args){
    Scanner in= new Scanner(System.in);
    String s= in.nextLine();

    int v0 =0 , c0 =0 ;
    for (int i=0;i<s.length();i++){
      char ch =s.charAt(i);
      if ((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
        char x = ch;
if (ch >= 'A'&& ch <='Z'){
    x =(char)(ch +32);
}

        if (x=='a'||x=='e'||x=='i'||x=='o'||x=='u')v0++;
        else c0++;
      }
    

  }
      if(v0>0 && c0>0 &&v0%3==0 &&c0%5==0)
          System.out.println("Aaarr! Me Plunder!!");
      else
          System.out.println("Blimey! No Plunder!!");
}
}

