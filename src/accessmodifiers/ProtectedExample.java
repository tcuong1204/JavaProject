package accessmodifiers;

import sharing.AccessModifiers;

public class ProtectedExample extends AccessModifiers{

    public static void main(String[] args) {

        AccessModifiers accessModifiers = new AccessModifiers();
//        System.out.println(accessModifiers.color); // Not accessible protected variable from another package
        System.out.println(accessModifiers.price); // Is able to access public variable from another package

        ProtectedExample protectedExample = new ProtectedExample();
        System.out.println(protectedExample.color); // Now can access protected variable in subclass of different package


    }

}
