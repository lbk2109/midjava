package javaLambda.exam;

import java.util.ArrayList;
import java.util.List;

//내부클래스를 이용해서 CheckCar라는 인터페이스를 만들고, 
//그걸 구현하는 CheckCarForBigAndNotExpensive클래스를 만들어서 
//4명 이상이 탈 수 있고, 가격이 2500이하인 차를 검색합니다.

public class CarExam {
	public static void main(String[] args) {

		// Car객체를 만들어서 cars에 넣습니다.
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("작은차", 2, 800, 3));
		cars.add(new Car("봉고차", 12, 1500, 8));
		cars.add(new Car("중간차", 5, 2200, 0));
		cars.add(new Car("비싼차", 5, 3500, 1));

		printCheeperThan(cars, 10000);
		System.out.println("--------------------");

		printCar(cars, new CheckCarForBigAndNotExpensive());
		System.out.println("--------------------");

		printCar(cars, new CheckCar() {
			@Override
			public boolean test(Car car) {
				return car.capacity >= 4 && car.price < 2500;
			}
		});
		System.out.println("--------------------");

		printCar(cars,
				// 인터페이스 CheckCar의 test메소드에 대응하는 람다를 만듭니다.
				(Car car) -> {
					return car.capacity >= 4 && car.price < 2500;
				});

	}

	public static void printCheeperThan(List<Car> cars, int price) {
		for (Car car : cars) {
			if (car.price < price) {
				System.out.println(car);
			}
		}
	}

	// 람다식에서 사용하기 위하여 인터페이스를 정의
	public interface CheckCar {
		public boolean test(Car car);
	}

	public static void printCar(List<Car> cars, CheckCar checkCar) {
		for (Car car : cars) {
			if (checkCar.test(car))
				System.out.println(car);
			;
		}
	}

	static class CheckCarForBigAndNotExpensive implements CheckCar {
		@Override
		public boolean test(Car car) {
			return car.capacity >= 4 && car.price < 2500;
		}
	}

}
