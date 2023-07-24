package sharing;

public class AccessModifiers {

    public int price = 30000;
    private String brand = "Honda"; // Go to AccessModifiers2 to it not allows to access from another class
    protected String color = "Black";  // Go to accessmodifiers.ProtectedExample to see how to access protected variable from another package


    public static void main(String[] args) {


    }

    private void Audi() {
        // Access private variable in a same class is allowed
        this.brand = "Audi";
        System.out.println(this.brand);
    }

    private void Toyota() {
        this.brand = "Toyota";
        System.out.println(this.brand);
    }

    public void start() {
        System.out.println("Starting");
    }

    public void stop() {
        System.out.println("Stopping");
    }

}
