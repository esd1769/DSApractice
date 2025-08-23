import java.util.Scanner;

public class h5{
  public static void main(String[] args){
    Scanner in =new Scanner(System.in);
    String name= in.nextLine();
    String pass =in.nextLine();

    boolean f0und= false;

    for (int i=0;i<name.length();i++){
      for(int j=0;j<pass.length();j++){
        if(name.charAt(i)==pass.charAt(j)){
          int k=i,l=j;
          String an1="",an2="";
            while(k<name.length()&&l<pass.length()){
              an1+=name.charAt(k);
              an2+=pass.charAt(l);

              k++;l++;
          }
            if (an1.equals(an2)&&(an1.length()==name.length())){
              f0und=true;
              break;
            }
        }
      }
    }
    if(f0und)System.out.println("Invalid");
    else {System.out.println("Valid");}
  }
}

