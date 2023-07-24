package sharing;

public class OOPInheritance {

    public static void main(String[] args) {


    }


}

class ParentClass {

    int age = 18;

    void setAge(int age) {
        this.age = age;
    }
    void getAge() {
        System.out.println("Age: " + this.age);
    }

}

// Single Inheritance: In this type of inheritance, one child class derives from one parent class
class ChildClass extends ParentClass{

    char gender = 'M';
    void getAge() {
        System.out.println("Age: " + this.age);  // Inheritance age from parent class
    }

}



// Multi-level Inheritance: In this type of inheritance, the child class derives from a class which already derived from another class
class ChildChildClass extends ChildClass {

    void getGender() {
        System.out.println("Gender: " + this.gender);
    }

    void getInfor() {
        getAge();
        getGender();
    }
}



// Hierarchical Inheritance: In this type of inheritance, two or more child classes derive from one parent class.
class ChildClass2 extends ParentClass {

    void setInfo() {
        setAge(30);
    }
}