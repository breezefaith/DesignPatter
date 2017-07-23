package structing.decorator.framework;

public class TestDecoratorFramework {

	public static void main(String[] args) {
		Compoment compoment=new ConcreteCompoment();
		/*
		 * 进行装饰
		 */
		compoment=new ConcreteDecorator(compoment);
		compoment.operation();
	}

}
