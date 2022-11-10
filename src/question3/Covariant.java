package question3;


class Vehicle {
    Vehicle getObject() {
        System.out.println("The Base class method is vehicle");
        return new Vehicle(); 
    }
}

class Car extends Vehicle {
    //Overriding getObject method.
    @Override
    Car getObject() {
        System.out.println("Derived vehicle class  method from Base class.");
        return new Car(); 
    }
}
