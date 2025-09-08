package lab1;

public class Multiples {
    public static void main(String[] args) {
        int howMany = multiples(999, 3, 5);

        System.out.println(howMany);
    }

    public static int multiples(int n, int a, int b) {
        int howMany = 0;
        int i = 1;

        while (i < n) {
            boolean divisibleBya = i % a == 0;
            boolean divisibleByb = i % b == 0;
 
            if (divisibleBya || divisibleByb) {
               howMany++;
            }
            i++;
        }
        return howMany;
    }
}
