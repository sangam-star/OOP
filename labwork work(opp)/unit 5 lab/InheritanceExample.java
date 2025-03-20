class Vehicle {
    int speed;

    Vehicle(int speed) {
        this.speed = speed;
    }

    void showSpeed() {
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    String model;

    Car(int speed, String model) {
        super(speed); // Calls the parent class (Vehicle) constructor
        this.model = model;
    }

    void display() {
        super.showSpeed(); // Calls the showSpeed() method from Vehicle
        System.out.println("Car Model: " + model);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car(120, "Toyota Corolla");
        myCar.display();
    }
}
