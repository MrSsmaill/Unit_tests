package seminars.second.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class VehicleTest {
    @Test
    public void testCarOfVehicle() {
        Car car = new Car("BMW", "i4", 2022);
        Assertions.assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Cadillac", "CT4-V", 2020);
        Assertions.assertEquals(car.getNumWheels(), 4);
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja", 2011);
        Assertions.assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    public void testCarSpeed() {
        Car car = new Car("Chevrolet", "Corvette", 2017);
        car.testDrive();
        Assertions.assertEquals(car.getSpeed(), 60);
    }

    @Test
    public void testMotorcycleSpeed() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CRF", 2004);
        motorcycle.testDrive();
        Assertions.assertEquals(motorcycle.getSpeed(), 75);
    }

    @Test
    public void testCarPark() {
        Car car = new Car("Honda", "Accord", 2015);
        car.testDrive();
        car.park();
        Assertions.assertEquals(car.getSpeed(), 0);
    }

    @Test
    public void testMotorcyclePark() {
        Motorcycle motorcycle = new Motorcycle("Sharmax", "Expert Pro", 2012);
        motorcycle.testDrive();
        motorcycle.park();
        Assertions.assertEquals(motorcycle.getSpeed(), 0);
    }

}