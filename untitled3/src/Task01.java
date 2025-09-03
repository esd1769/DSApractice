import java.util.Scanner;

public class Task01{
    

    public static boolean isPrime(int n){
        if (n<= 1)return false;

        
        for (int i =2;i < n;i++){
            
            
            if (n % i== 0)return false;
        }
    return true;
    }




    public static boolean isPerfect(int n){
        if (n <=1)return false;

        
        int sum= 0;

        
        for (int i =1;i <n;i++){
            if(n % i ==0) sum +=i;
        }

        
    return sum== n;
    }

    

    public static int special_sum(int limit){
        int total =0;
        for (int i= 1;i <=limit;i++){

            
            if (isPrime(i)||isPerfect(i)){
            total +=i;
            }

            
        }
        return total;
    }


    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        

        boolean check = isPrime(7);
        System.out.println(check);
        check = isPrime(15);
        System.out.println(check);


        check = isPerfect(6);
        System.out.println(check);
        check = isPerfect(33);
        System.out.println(check);
        int val= sc.nextInt();


        int result =special_sum(val);
        System.out.println(result);
    }
}
