public class ass3{
    public static void main(String[] args){
        int id=23221454;
        int lastTwo=id%100;
        int digit1=lastTwo%10;
        int digit2=lastTwo/10;

        System.out.println(digit1 +", " +digit2);
    }
}
