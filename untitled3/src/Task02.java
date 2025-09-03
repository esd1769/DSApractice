public class Task02{
    
  
    
    public static void showDots(int n)
    {
        for(int i =0; i <n;i++){
            System.out.print(".");
    }
    }

  
    
    public static void show_palindrome(int n){
        for (int i =1;i <= n;i++){
        
            System.out.print(i);
        }
        for(int i =n -1; i>=1;i--){
        
            System.out.print(i);
    }
    }

    

    public static void showDiamond(int n){
      
        
        for(int i = 1;i <=n;i++){
            showDots(n- i);
            
            show_palindrome(i);
            showDots(n -i);
           
            System.out.println();
    }
    
    
        for(int i = n -1; i >=1;i--){
        showDots(n- i);
            
        show_palindrome(i);
            showDots(n -i);
            
            System.out.println();
    }
    }

    public static void main(String[] args)
    {
        showDots(5);
        System.out.println();
        showDots(3);
        System.out.println();
        show_palindrome(5);
        System.out.println();
        show_palindrome(3);
        System.out.println();



        showDiamond(5);
        System.out.println();
        showDiamond(3);


    }
}
