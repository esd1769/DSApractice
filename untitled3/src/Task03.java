import java.util.Scanner;

public class Task03 {
    

    
    public static double calcTax(int age, double salary){
        if (age <18)return 0.0;
        
        if (salary< 10000)return 0.0;
        if (salary <=20000) return salary* 0.07;
        
        return salary *0.14;
    }



    public static void calcYearlyTax()
    {
        Scanner sc= new Scanner(System.in);
        int age =sc.nextInt();
        
        double total=0;
        for (int m= 1;m <= 12;m++){
            
            double salary= sc.nextDouble();
            double tax =calcTax(age,salary);
            if(tax==0.0) {System.out.println("Month" + m + " tax: " + 0);
                total+=tax;}

            else {
                System.out.printf("Month%d tax: %.1f",m, tax);
                System.out.println();

                total+=tax;
            }
            

        }
        

            System.out.printf("Total Yearly Tax: %.1f", total);
            System.out.println();

    }

    public static void main(String[] args)

    {
        double t = calcTax(16,20000);
        System.out.printf("%.1f",t);
        System.out.println();
        t = calcTax(20,18000);
        System.out.printf("%.1f",t);
        System.out.println();


        calcYearlyTax();
    }
}
