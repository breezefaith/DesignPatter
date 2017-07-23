package structing.decorator.example;

public class TestDecoratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICar car=new Benz();
		car=new BenzDecorator(car);
		car.show();
	}

}
