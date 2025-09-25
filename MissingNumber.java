public class MissingNumber {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 4, 5, 6};
        int n = 6;

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        int missing = (n * (n + 1) / 2) - sum;
        System.out.println("Missing number: " + missing);




    }
}
