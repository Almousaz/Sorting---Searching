public class SortArrayAscending {
    public static void main(String[] args) {


//        rearrange it from smallest to largest
//        int[] numbers = {5, 2, 8, 1, 4};
//
//        for (int i = 0; i < numbers.length - 1; i++) {
//
//            for (int j = 0; j < numbers.length - 1; j++) {
//                if (numbers[j] > numbers[j + 1]) {
//                    int temp = numbers[j];
//                    numbers[j] = numbers[j + 1];
//                    numbers[j + 1] = temp;
//                }
//
//            }
//
//        }
//        for (int x = 0; x < numbers.length; x++) {
//            System.out.print(numbers[x] + " ");
//
//        }
//
//
//        int[] numberOfMan = {15, 19, 8, 3, 75, 24, 6, 2, 74};
//
//        for (int i = 0; i < numberOfMan.length - 1; i++) {
//            for (int j = 0; j < numberOfMan.length - 1; j++) {
//                if (numberOfMan[j] > numberOfMan[j+1]) {
//                    int temp = numberOfMan[j];
//                    numberOfMan[j] = numberOfMan[j + 1];
//                    numberOfMan[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println(" ");
//        for (int x = 0; x < numberOfMan.length; x++) {
//            System.out.print(numberOfMan[x] + " ");
//        }


        int[] points = {10, 6, 7, 9, 2, 4};

        for (int x = 0; x < points.length - 1; x++) {
            for (int z = 0; z < points.length - 1; z++) {
                if (points[z] > points[z + 1]) {
                    int temp = points[z];
                    points[z] = points[z + 1];
                    points[z + 1] = temp;
                }
            }
        }
        for (int i = 0; i < points.length; i++) {
            System.out.print(points[i] + " ");
        }



    }
}
