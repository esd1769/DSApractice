public class ReverseLastTwoDigits {
    public static void main(String[] args) {
        int studentId = 23221454;
        int lastTwo = studentId % 100;
        int digit1 = lastTwo % 10;        // Rightmost
        int digit2 = lastTwo / 10;        // Second last

        System.out.println("Reversed last two digits: " + digit1 + ", " + digit2);
    }
}
