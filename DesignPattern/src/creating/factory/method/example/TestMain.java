package creating.factory.method.example;

public class TestMain {

	public static void main(String[] args) {
		CarFactory carFactory=new FordCarFactory();
		Car car=carFactory.createCar();
		car.info();
		
		carFactory=new BenzCarFoctory();
		car=carFactory.createCar();
		car.info();
	}

}
