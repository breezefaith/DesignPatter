package structing.bridge.framework;

public class Client {

	public static void main(String[] args) {
		Implementor implementor=new ConcreteImplementor();
		
		Abstraction abstraction=new RefineAbstraction(implementor);
		
		abstraction.operation();
	}

}
