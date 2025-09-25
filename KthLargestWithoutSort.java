public class KthLargestWithoutSort {
    public static void main(String[] args) {


//         finding the Kth largest number
//         like finding  the second-largest number in Array

            int[] numbers = {5, 2, 8, 1, 4};
            int k = 2;

//        for (int i = 0; i < k; i++) {
//            System.out.println(numbers[i]);
//        }
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





//        finding the largest number
        int[] values = {2, 3, 4, 5, 68, 8};
        int largestNumValues = values[0];
        for (int i = 0; i < values.length ; i++) {
            if (largestNumValues < values[i]) {
                largestNumValues = values[i];
            }
        }
        System.out.println("largest num value : " + largestNumValues);


//        finding the smallest number

        int[] points = {12, 5, 6, 8, 4, 3, 7};
        int smallest = points[0];
        for (int j = 0; j < points.length; j++) {
            if (smallest > points[j]) {
                smallest = points[j];
            }
        }
        System.out.println("smallest : " + smallest);


        int[] dataOfStreet = {50, 20, 30, 40, 70, 60, 80, 90};
        int kth = 4;

        for (int i = 0; i < kth; i++) {

             int maxIndex1 = i;
            for (int j = i + 1; j < dataOfStreet.length; j++) {
                if (dataOfStreet[j] > dataOfStreet[maxIndex1]) {
                    maxIndex1 = j;
                }
            }
            int temp = dataOfStreet[i];
            dataOfStreet[i] = dataOfStreet[maxIndex1];
            dataOfStreet[maxIndex1] = temp;
        }
        System.out.println(kth + " th largest number : " + dataOfStreet[kth - 1]);





    }
}
