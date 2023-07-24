package sharing;

public class AccessModifiers2 {

    public static void main(String[] args) {

        AccessModifiers accessModifiers = new AccessModifiers();

        System.out.println(accessModifiers.price);
//        System.out.println(accessModifiers.branch);  // Cannot access private variable from another class
        System.out.println(accessModifiers.price);  // Accessible protected variable within same package

        accessModifiers.start();
//        accessModifiers.Audi(); // Cannot access private method from another class

    }

}
