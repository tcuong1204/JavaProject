package sharing;

public class Interfaces {

}

// Give example about Car and CarForm interfaces then create some classes like Audi, Toyota to inherit these interfaces
interface Car {
    void setCar();
    void getCar();
}



// An interface implemented by a class
class Audi implements Car {
    public void setCar() {

    }

    public void getCar() {

    }
}

// An interface may extend another interface
interface CarFrom extends Car {
    void setColor();
}

class Honda implements CarFrom {
    public void setColor() {

    }
    public void setCar() {

    }

    public void getCar() {

    }

}


// An interface never implements another interface, or class.
//interface abc implements Car {
//
//}
//
//interface def implements Honda {
//
//}


// A class may implement any number of interfaces.
class Toyota implements Car, CarFrom {
    public void setColor() {

    }
    public void setCar() {

    }

    public void getCar() {

    }
}