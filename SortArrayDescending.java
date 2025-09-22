public class SortArrayDescending {
    public static void main(String[] args) {


//        sort an array in descending order
//        from largest to smallest

        int[] numbers = {5, 2, 8, 1, 4};

        for (int i = 0; i < numbers.length - 1; i++) {

            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }

            }

        }
        for (int x = 0; x < numbers.length; x++) {
            System.out.print(numbers[x] + " ");

        }

    }
}
