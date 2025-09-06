// Define a class named Car
class Car {
    // Declare fields (attributes) of the class
    String model;
    int year;
    String color;

    // Constructor to initialize the Car object
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car Color: " + color);
    }
}


