import java.util.*;

public class ass1{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int min=sc.nextInt();

        //int min=3456789;
        int minutestoDay=60 *24;
        int minutestoYear=minutestoDay*365;

        int years= min/minutestoYear;
        int days=(min% minutestoYear)/minutestoDay;


        System.out.println(min+" minutes is approximately " + years+ " years and " +days+" days");
    }
}
