public class KthLargestWithoutSort {
    public static void main(String[] args) {


//         finding the Kth largest number
//         like finding  the second-largest number in Array

            int[] numbers = {5, 2, 8, 1, 4};
            int k = 2;

        for (int i = 0; i < k; i++) {
            System.out.println(numbers[i]);
        }

        for (int i = 0; i < k; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[maxIndex];
            numbers[maxIndex] = temp;
        }
        System.out.println(k + " th largest number : " + numbers[k - 1]);




    }
}
