package sharing;

public class DataTypes {

    public static void main(String[] args) {

        // Primitive
        int age = 10;
        double weight = 15.5;
        char logo = 'k';
        boolean result = true;

        byte minByte = -128;
        byte maxByte = 127;

        float pi = 3.1415f;


        // Non-primitive
        String myName = "John";
        int[] array = {5, 4, 6, 5}; // Because we declared int data type, so the values of array should be int
        Method method = new Method(); // Call class method


        // Use static variable
        System.out.println(Variables.weight);


    }

}
