public class ass {
    public static void main(String[] args){
        int a=2;
        int b=5;
        int c =8;
        int d =a+b*c/a+b;
        // Note: Without parentheses, it's interpreted as: ((a + ((b * c) / a)) + b)

        System.out.println("Value of d: "+d); // Should be 27
    }
}


