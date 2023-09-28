public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int start = 25;
        int end = 51;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of even numbers between " + start + " and " + end + " is: " + sum);
    }
}
