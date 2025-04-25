import java.util.*;
class Tollbooth {
    int carsPassed = 0;
    int carsWithoutPaying = 0;
    int totalCashCollected = 0;

    void carPasses(boolean paid) {
        carsPassed++;
        if (!paid) {
            carsWithoutPaying++;
        } else {
            totalCashCollected += 50;
        }
    }

    void display() {
        System.out.println("The total number of cars passed by without paying: " + carsWithoutPaying);
        System.out.println("Total number of cars passed by: " + carsPassed);
        System.out.println("Total cash collected: Rs. " + totalCashCollected);
    }

    public static void main(String[] args) {
        Tollbooth tollbooth = new Tollbooth();
        tollbooth.carPasses(true);
        tollbooth.carPasses(false);
        tollbooth.carPasses(true);
        tollbooth.carPasses(true);
        tollbooth.carPasses(false);
        tollbooth.display();
    }
}
