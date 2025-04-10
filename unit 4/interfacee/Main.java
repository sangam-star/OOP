// This code demonstrates the use of interfaces in Java.



interface Chargeable {
    void charge(); 
}

// Phone class

class Phone implements Chargeable {
    public void charge() {
        System.out.println("Charging phone with USB-C.");
    }
}

// Laptop class
class Laptop implements Chargeable {
    public void charge() {
        System.out.println("Charging laptop with 65W adapter.");
    }
}

// ElectricCar class
class ElectricCar implements Chargeable {
    public void charge() {
        System.out.println("Charging electric car at charging station.");
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        Chargeable p = new Phone();
        Chargeable l = new Laptop();
        Chargeable e = new ElectricCar();

        p.charge();
        l.charge();
        e.charge();
    }
}
