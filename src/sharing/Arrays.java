package sharing;

public class Arrays {

    public static void main(String[] args) {

        // Declare array based on size with 'new'
        int array1[] = new int[10];
        int[] array2 = new int[5];


        // Declare array without a specific size
        int[] array3 = {50, 20, 80, 10, 20};


        // NullPointerException (try assign a value after declaring array with null)
//        String[] array4 = null;
//        array4[0] = "Name";


        // ArrayIndexOutOfBoundsException: when an array is trying to access with an index value of negative value
        System.out.println("Array1 before assigning value: ");
        printArray(array1);
        array1[0] = 10;
        array1[5] = 20;
//        array1[10] = 30;
        System.out.println("Array1 after assigning value: ");
        printArray(array1);


        // Array methods
        System.out.println(array2.length);
        System.out.println(array3.length);

        // Multidimensional Arrays
        int[][] matrix = {{10, 20}, {30, 40}};
        printArray(matrix);

    }


    public static void printArray(int[] array) {
        System.out.println("Value of array: ");
        for (int element: array) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }

    public static void printArray(int[][] array) {
        System.out.println("Value of matrix: ");
        for (int[] element1: array) {
            for (int element2 : element1) {
                System.out.print(element2 + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
