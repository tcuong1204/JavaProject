package sharing;

public class Method {

    // Define a method
    public static void FirstMethod() {
        System.out.println("This is basic method without parameter and returning");
    }


    // Define a method with parameters
    public static void SecondMethod(String value) {
        System.out.println("This is method with parameter value, this value is: " + value);
    }



    // Define a method with a return type
    public static int ThirdMethod(int a, int b) {
        System.out.println("This is method with a return type");
        return a + b;
    }


    // Define a method with same name
    public static void SecondMethod(String value1, String value2) {
        System.out.println("This is method that same name as SecondMethod but with different parameters. These are: " + value1 + " and " + value2);
    }



    // E.g. built in methods
    public void BuiltInMethod() {
        System.out.println();
        System.setProperty("ABC", "def");
    }



    public static void main(String[] args) {

        Method method = new Method();

        FirstMethod();
        SecondMethod("ABCD");
        SecondMethod("ABCD", "EFGH");

        int result = ThirdMethod(10, 2);
        System.out.println("Result of ThirdMethod: " + result);

    }


}
