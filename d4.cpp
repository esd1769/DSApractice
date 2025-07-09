import java.util.*;

public class ass1 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int min=sc.nextInt();

        //int min=3456789;
        int minutesInDay = 60 * 24;
        int minutesInYear = minutesInDay * 365;

        int years = min/ minutesInYear;
        int days = (min% minutesInYear)/minutesInDay;


        System.out.println(min+ " minutes is approximately " + years + " years and " + days + " days");
    }
}

