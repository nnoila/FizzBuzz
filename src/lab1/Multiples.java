package lab1;

public class Multiples {
    public static void main(String[] args) {
        multiples();
    }

    private static void multiples() {
        int limit = 1000;
        int howMany = 0;
        int i = 1;

        while (i < limit) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
 
            if (divisibleBy3 || divisibleBy5) {
               howMany++;
            }
            i++;
        }
        System.out.println(howMany);
    }
}
