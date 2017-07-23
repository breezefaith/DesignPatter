package creating.builder.example;

public class TestBuilder {

	public static void main(String[] args) {
		CarDirector director=new CarDirector();
		Car car=director.buildBenz();
		car.run();
		car=director.buildFord();
		car.run();
	}

}
