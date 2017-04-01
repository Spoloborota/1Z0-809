package com.spoloborota.ocp.lambdas.javarush.car;

import java.util.Arrays;
import java.util.List;

public class CarTest {

	public static void main(String[] args) {
		Car car = Car.create(Car::new);
		List<Car> cars = Arrays.asList(car);
		cars.forEach(Car::collide);
		cars.forEach(Car::repair);
		Car police = Car.create(Car::new);
		cars.forEach(police::follow);
	}

}
