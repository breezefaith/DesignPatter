package creating.factory.method.framework;

public class TestFactoryMethod {

	public static void main(String[] args) {
		Creater creater=new ConcreteCreater();
		ConcreteProduct product=creater.factory(ConcreteProduct.class);
		product.method1();
	}

}
