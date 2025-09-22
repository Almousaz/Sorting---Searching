public class KthSmallestNoSort {
    public static void main(String[] args) {


        int[] numbers = {7, 2, 9, 4, 1};
        int k = 3;

        for (int i = 0; i < k; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;

                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

        System.out.println(k + "smallest : " + numbers[k - 1]);



    }
}
