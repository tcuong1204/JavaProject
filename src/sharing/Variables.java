package sharing;

public class Variables {

    // Syntax: DataType VariableName = Value;
    int price;
    int age = 20;

    String name, gender;
    String branch = "Audi", company = "Volkswagen";

    // Instance variables: The variables declared inside a class and outside any method, these variables are visible to all the methods of the class
    String carName = "Honda";

    // Static variables: are initialized only once, at the start of the program execution, access by using class name
    // Go to DataTypes.java to see how to use this variable
    static double weight = 350.5;

    // Final variables
    final double pi = 3.14;


    // Type casting
    // Widening type casting: byte -> short -> char -> int -> long -> float -> double - Auto
    int x = 7;
    long y = x; // Automatically converts the integer type to long type
    float z = y; // Automatically converts the long type to float type
//    short t = z; // Cannot convert a high data to lower data type

    // Narrowing type casting: double -> float -> long -> int -> char -> short -> byte - Manual
    float f = 16.666f;
    int l = (int) f;
    double d = (float) f;


    public void start() {

        // Local variables: are used in this method
        String message = "The car has started";

        // Use instance variable
        System.out.println("Car name: " + carName);

        System.out.println(d);

//         Block of code below tell that we are not able to change value of final variable
//        this.carName = "Audi";
//        weight = 249.5;
//        pi = 3.15;


    }

    public static void main(String[] args) {

        Variables variables = new Variables();
        variables.start();

    }
}
